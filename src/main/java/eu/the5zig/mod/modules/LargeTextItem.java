/*
 * Copyright (c) 2019-2020 5zig Reborn
 * Copyright (c) 2015-2019 5zig
 *
 * This file is part of The 5zig Mod
 * The 5zig Mod is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The 5zig Mod is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with The 5zig Mod.  If not, see <http://www.gnu.org/licenses/>.
 */

package eu.the5zig.mod.modules;

import eu.the5zig.mod.The5zigAPI;
import eu.the5zig.mod.render.RenderLocation;
import eu.the5zig.mod.server.GameMode;
import eu.the5zig.mod.server.GameState;

public abstract class LargeTextItem<T extends GameMode> extends GameModeItem<T> {

	public LargeTextItem(Class<? extends T> modeClass, GameState... state) {
		super(modeClass, state);
	}

	@Override
	public void render(int x, int y, RenderLocation renderLocation, boolean dummy) {
		if (dummy) {
			return;
		}
		The5zigAPI.getAPI().getRenderHelper().drawLargeText(The5zigAPI.getAPI().getFormatting().getPrefixFormatting() + getText());
	}

	protected abstract String getText();

	@Override
	protected Object getValue(boolean dummy) {
		return getText();
	}

	@Override
	public int getWidth(boolean dummy) {
		return 0;
	}

	@Override
	public int getHeight(boolean dummy) {
		return 0;
	}
}
