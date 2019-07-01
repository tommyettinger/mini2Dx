/*******************************************************************************
 * Copyright 2019 See AUTHORS file
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.mini2Dx.libgdx;

import org.mini2Dx.core.GraphicsUtils;
import org.mini2Dx.core.files.FileHandle;
import org.mini2Dx.core.graphics.*;
import org.mini2Dx.libgdx.files.LibgdxFileHandle;
import org.mini2Dx.libgdx.graphics.LibgdxColor;
import org.mini2Dx.libgdx.graphics.LibgdxPixmap;
import org.mini2Dx.libgdx.graphics.LibgdxTexture;
import org.mini2Dx.libgdx.graphics.LibgdxTextureRegion;

public class LibgdxGraphicsUtils implements GraphicsUtils {
	@Override
	public Color newColor(int rgba8888) {
		return new LibgdxColor(rgba8888);
	}

	@Override
	public Color newColor(int r, int g, int b, int a) {
		return new LibgdxColor(r, g, b, a);
	}

	@Override
	public Color newColor(float r, float g, float b, float a) {
		return new LibgdxColor(r, g, b, a);
	}

	@Override
	public Color newColor(byte r, byte g, byte b, byte a) {
		return new LibgdxColor(r, g, b, a);
	}

	@Override
	public Pixmap newPixmap(int width, int height, PixmapFormat format) {
		return new LibgdxPixmap(new com.badlogic.gdx.graphics.Pixmap(width, height, LibgdxPixmap.toGdxPixmapFormat(format)));
	}

	@Override
	public Pixmap newPixmap(FileHandle file) {
		final LibgdxFileHandle gdxFileHandle = (LibgdxFileHandle) file;
		return new LibgdxPixmap(new com.badlogic.gdx.graphics.Pixmap(gdxFileHandle.fileHandle));
	}

	@Override
	public Texture newTexture(FileHandle file) {
		final LibgdxFileHandle gdxFileHandle = (LibgdxFileHandle) file;
		return new LibgdxTexture(gdxFileHandle.fileHandle);
	}

	@Override
	public Texture newTexture(FileHandle file, PixmapFormat format) {
		final LibgdxFileHandle gdxFileHandle = (LibgdxFileHandle) file;
		return new LibgdxTexture(gdxFileHandle.fileHandle, LibgdxPixmap.toGdxPixmapFormat(format), false);
	}

	@Override
	public Texture newTexture(Pixmap pixmap) {
		final LibgdxPixmap gdxPixmap = (LibgdxPixmap) pixmap;
		return new LibgdxTexture(gdxPixmap.pixmap);
	}

	@Override
	public Texture newTexture(Pixmap pixmap, PixmapFormat format) {
		final LibgdxPixmap gdxPixmap = (LibgdxPixmap) pixmap;
		return new LibgdxTexture(gdxPixmap.pixmap, LibgdxPixmap.toGdxPixmapFormat(format), false);
	}

	@Override
	public Texture newTexture(byte[] fileData) {
		final com.badlogic.gdx.graphics.Pixmap pixmap = new com.badlogic.gdx.graphics.Pixmap(fileData, 0, fileData.length);
		return new LibgdxTexture(pixmap);
	}

	@Override
	public TextureRegion newTextureRegion(Texture texture) {
		final LibgdxTexture gdxTexture = (LibgdxTexture) texture;
		return new LibgdxTextureRegion(new com.badlogic.gdx.graphics.g2d.TextureRegion(gdxTexture));
	}

	@Override
	public TextureRegion newTextureRegion(Texture texture, int width, int height) {
		final LibgdxTexture gdxTexture = (LibgdxTexture) texture;
		return new LibgdxTextureRegion(new com.badlogic.gdx.graphics.g2d.TextureRegion(gdxTexture, width, height));
	}

	@Override
	public TextureRegion newTextureRegion(Texture texture, int x, int y, int width, int height) {
		final LibgdxTexture gdxTexture = (LibgdxTexture) texture;
		return new LibgdxTextureRegion(new com.badlogic.gdx.graphics.g2d.TextureRegion(gdxTexture, x, y, width, height));
	}

	@Override
	public TextureRegion newTextureRegion(TextureRegion texture) {
		final LibgdxTextureRegion gdxTextureRegion = (LibgdxTextureRegion) texture;
		return new LibgdxTextureRegion(gdxTextureRegion);
	}

	@Override
	public TextureRegion newTextureRegion(TextureRegion texture, int width, int height) {
		return newTextureRegion(texture, texture.getRegionX(), texture.getRegionY(), width, height);
	}

	@Override
	public TextureRegion newTextureRegion(TextureRegion texture, int x, int y, int width, int height) {
		final LibgdxTextureRegion gdxTextureRegion = (LibgdxTextureRegion) texture;
		return new LibgdxTextureRegion(new com.badlogic.gdx.graphics.g2d.TextureRegion(gdxTextureRegion.textureRegion, x, y, width, height));
	}

	@Override
	public Sprite newSprite(Texture texture) {
		final LibgdxTexture gdxTexture = (LibgdxTexture) texture;
		return null;
	}

	@Override
	public Sprite newSprite(Texture texture, int width, int height) {
		final LibgdxTexture gdxTexture = (LibgdxTexture) texture;
		return null;
	}

	@Override
	public Sprite newSprite(Texture texture, int x, int y, int width, int height) {
		final LibgdxTexture gdxTexture = (LibgdxTexture) texture;
		return null;
	}

	@Override
	public Sprite newSprite(TextureRegion texture) {
		return null;
	}

	@Override
	public Sprite newSprite(TextureRegion texture, int width, int height) {
		return null;
	}

	@Override
	public Sprite newSprite(TextureRegion texture, int x, int y, int width, int height) {
		return null;
	}

	@Override
	public Sprite newSprite(Sprite sprite) {
		return null;
	}

	@Override
	public TextureAtlas newTextureAtlas(FileHandle packFile) {
		return null;
	}

	@Override
	public TextureAtlas newTextureAtlas(FileHandle packFile, boolean flip) {
		return null;
	}

	@Override
	public TextureAtlas newTextureAtlas(FileHandle packFile, FileHandle imagesDir) {
		return null;
	}

	@Override
	public TextureAtlas newTextureAtlas(FileHandle packFile, FileHandle imagesDir, boolean flip) {
		return null;
	}

	@Override
	public ParticleEffect newParticleEffect() {
		return null;
	}

	@Override
	public ParticleEffect newParticleEffect(FileHandle effectFile, FileHandle imagesDir) {
		return null;
	}

	@Override
	public ParticleEffect newParticleEffect(FileHandle effectFile, TextureAtlas atlas) {
		return null;
	}

	@Override
	public NinePatch newNinePatch(Texture texture, int left, int right, int top, int bottom) {
		final LibgdxTexture gdxTexture = (LibgdxTexture) texture;
		return null;
	}

	@Override
	public NinePatch newNinePatch(TextureRegion region, int left, int right, int top, int bottom) {
		return null;
	}

	@Override
	public FrameBuffer newFrameBuffer(int width, int height) {
		return null;
	}
}