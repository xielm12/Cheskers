/***********************************************************************************************************************
 * Copyright (C) 2011, Mario Zechner <badlogicgames@gmail.com>
 * Copyright (C) 2013, Michael Brown <mthomsonbrown@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 ***********************************************************************************************************************/

package com.ookamijin.framework;

public abstract class Screen {
	protected final Game game;

	public Screen(Game game) {
		this.game = game;
	}

	public abstract void update(float deltaTime);

	public abstract void paint(float deltaTime);

	public abstract void pause();

	public abstract void resume();

	public abstract void dispose();

	public abstract void backButton();
}