/*******************************************************************************
 * This file is part of logisim-evolution.
 *
 *   logisim-evolution is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   logisim-evolution is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with logisim-evolution.  If not, see <http://www.gnu.org/licenses/>.
 *
 *   Original code by Carl Burch (http://www.cburch.com), 2011.
 *   Subsequent modifications by :
 *     + Haute École Spécialisée Bernoise
 *       http://www.bfh.ch
 *     + Haute École du paysage, d'ingénierie et d'architecture de Genève
 *       http://hepia.hesge.ch/
 *     + Haute École d'Ingénierie et de Gestion du Canton de Vaud
 *       http://www.heig-vd.ch/
 *   The project is currently maintained by :
 *     + REDS Institute - HEIG-VD
 *       Yverdon-les-Bains, Switzerland
 *       http://reds.heig-vd.ch
 *******************************************************************************/
package com.hepia.logisim.chronogui;

/**
 * Contains draw data that are common between LeftPanel and RightPanel
 */
public class CommonPanelParam {

	private int mHeaderHeight;
	private int mSignalHeight;

	/**
	 * CommonPanelParam defines the header and signal height
	 * 
	 * @param headerHeight
	 *            header height in pixel
	 * @param signalHeight
	 *            signal height in pixel
	 */
	public CommonPanelParam(int headerHeight, int signalHeight) {
		mHeaderHeight = headerHeight;
		mSignalHeight = signalHeight;
	}

	public int getHeaderHeight() {
		return mHeaderHeight;
	}

	public int getSignalHeight() {
		return mSignalHeight;
	}

	public void setHeaderHeight(int height) {
		mHeaderHeight = height;
	}

	public void setSignalHeight(int height) {
		mSignalHeight = height;
	}
}
