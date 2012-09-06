/**
 * Copyright 2012 multibit.org
 *
 * Licensed under the MIT license (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://opensource.org/licenses/mit-license.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.multibit.utils;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.ImageIcon;

import org.multibit.viewsystem.swing.MultiBitFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImageLoader {
    private static final Logger log = LoggerFactory.getLogger(ImageLoader.class);

    public static final String ACCEPT_ICON_FILE = "/images/accept.png";
    public static final String ADD_ICON_FILE = "/images/add.png";
    public static final String ADD_PASSWORD_ICON_FILE = "/images/lockAdd.png";
    public static final String ARROW_LEFT_ICON_FILE = "/images/arrowLeft.png";
    public static final String ARROW_RIGHT_ICON_FILE = "/images/arrowRight.png";   
    public static final String CANCEL_ICON_FILE = "/images/cancel.png";
    public static final String CHANGE_PASSWORD_ICON_FILE = "/images/lockChange.png";
    public static final String CHART_LINE_ICON_FILE = "/images/chartLine.png";
    public static final String CLOSE_TAB_ICON_FILE = "/images/closeTab.png";
    public static final String COPY_ICON_FILE = "/images/copy.png";
    public static final String CREATE_NEW_ICON_FILE = "/images/createNew.png";
    public static final String CROSS_ICON_FILE = "/images/cross.png";
    public static final String DELETE_WALLET_ICON_FILE = "/images/deleteWallet.png";
    public static final String DELETE_ADDRESS_ICON_FILE = "/images/book_open_delete.png";
    public static final String DETAIL_PANEL_ON_ICON_FILE = "/images/twistyDown.png";
    public static final String DETAIL_PANEL_OFF_ICON_FILE = "/images/twistyRight.png";
    public static final String EXCHANGES_ICON_FILE = "/images/exchanges.png";
    public static final String EXCLAMATION_MARK_ICON_FILE = "/images/exclamationMark.png";
    public static final String EXPORT_PRIVATE_KEYS_ICON_FILE = "/images/exportKey.png";
    public static final String HELP_CONTENTS_BIG_ICON_FILE = "/images/helpContentsBig.png";
    public static final String HELP_CONTENTS_ICON_FILE = "/images/helpContents.png";
    public static final String HOURGLASS_ICON_FILE = "/images/hourglass.png";
    public static final String IMPORT_PRIVATE_KEYS_ICON_FILE = "/images/importKey.png";
    public static final String LOCK_ICON_FILE = "/images/lock.png";
    public static final String MESSAGES_ICON_FILE = "/images/comment.png";
    public static final String MONEY_ICON_FILE = "/images/money.png";
    public static final String MULTIBIT_128_ICON_FILE = "/images/multibit128.png";
    public static final String MULTIBIT_ICON_FILE = "/images/multibit.png";
    public static final String MULTIBIT_SMALL_ICON_FILE = "/images/multibit-small.png";
    public static final String OPEN_LOCK_ICON_FILE = "/images/openLock.png";
    public static final String OPEN_WALLET_ICON_FILE = "/images/openWallet.png";
    public static final String PASTE_ICON_FILE = "/images/paste.png";
    public static final String PICTURE_BLANK_ICON_FILE = "/images/pictureBlank.png";
    public static final String PREFERENCES_ICON_FILE = "/images/preferences.png";
    public static final String QUESTION_MARK_ICON_FILE = "/images/questionMark.png";
    public static final String RECEIVE_BITCOIN_ICON_FILE = "/images/receiveIn.png";
    public static final String REMOVE_PASSWORD_ICON_FILE = "/images/lockRemove.png";
    public static final String RESET_TRANSACTIONS_ICON_FILE = "/images/resetTransactions.png";
    public static final String RTL_WALLET_ICON_FILE = "/images/rtl_wallet.png";
    public static final String SEND_BITCOIN_ICON_FILE = "/images/sendOut.png";
    public static final String SIDE_PANEL_SHOW_ICON_FILE = "/images/sidePanelShow.png";
    public static final String SIDE_PANEL_SHOW_RTL_ICON_FILE = "/images/sidePanelShowRTL.png";
    public static final String SIDE_PANEL_HIDE_ICON_FILE = "/images/sidePanelHide.png";
    public static final String SIDE_PANEL_HIDE_RTL_ICON_FILE = "/images/sidePanelHideRTL.png";
    public static final String SINGLE_WALLET_ICON_FILE = "/images/singleWallet.png";
    public static final String SHAPE_SQUARE_ICON_FILE = "/images/shapeSquare.png";
    public static final String TICK_ICON_FILE = "/images/tick.png";
    public static final String TRANSACTIONS_ICON_FILE = "/images/transactions.png";
    public static final String UNDO_ICON_FILE = "/images/undo.png";
    public static final String WALLET_ICON_FILE = "/images/wallet.png";
    public static final String WELCOME_ICON_FILE = "/images/welcome.png";
    public static final String YOUR_WALLETS_ICON_FILE = "/images/yourWallets.png";
    public static final String ZOOM_ICON_FILE = "/images/zoom.png";
          
    public ImageLoader() {
        
    }
    
    /**
     * Returns an ImageIcon, or null if the path was invalid.
     */
    public static ImageIcon createImageIcon(String path) {
        if (path == null) {
            return null;
        }
        
        java.net.URL imgURL = MultiBitFrame.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            log.error("org.multibit.MultiBitFrame#createImageIcon: Could not find file: " + path);
            return null;
        }
    }
}
