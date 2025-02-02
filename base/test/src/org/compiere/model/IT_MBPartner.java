/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2020 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 ******************************************************************************
 *  @author Raul Capecce, raul.capecce@solopsoftware.com, Solop https://solopsoftware.com/
 *		<a href="https://github.com/adempiere/adempiere/issues/4188">
 * 		@see BF [ 4188 ] Badly formatted end of line in files</a>
 * */

package org.compiere.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.adempiere.test.CommonGWSetup;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Model")
@Tag("MBPartner")
class IT_MBPartner extends CommonGWSetup {

    @Test
	void testBPartner() {
		MBPartner test = MBPartner.getBPartnerCashTrx(getCtx(), 11);
		assertEquals(112, test.getC_BPartner_ID(), "Confirming right BPartner record");
	}

}
