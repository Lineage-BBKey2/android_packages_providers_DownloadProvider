/*
 * Copyright (C) 2026 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.providers.downloads;

import android.util.ArrayMap;
import android.util.ArraySet;

import java.util.Map;
import java.util.Set;

/** Compatibility redirects for archived BlackBerry Keyboard language packs. */
final class BlackBerryLanguagePackRedirects {
    private static final String SOURCE_BASE_URL =
            "https://bbapps.download.blackberry.com/keyboard/languages/1902.01/";
    private static final String WAYBACK_BASE_URL = "https://web.archive.org/web/";
    private static final String ARCHIVE_BASE_URL = "https://archive.org/download/bbarchive/";

    private static final Set<String> ARCHIVE_PATHS = createArchivePaths();

    private static final Map<String, String> CAPTURE_TIMESTAMPS = createCaptureTimestamps();

    private BlackBerryLanguagePackRedirects() {}

    static String maybeRewrite(String requestUri) {
        if (!requestUri.startsWith(SOURCE_BASE_URL)) {
            return requestUri;
        }

        final String relativePath =
                requestUri.substring(SOURCE_BASE_URL.length());

        if (ARCHIVE_PATHS.contains(relativePath)) {
            final int lastSlash = relativePath.lastIndexOf('/');
            final String fileName =
                    lastSlash >= 0
                            ? relativePath.substring(lastSlash + 1)
                            : relativePath;

            return ARCHIVE_BASE_URL + fileName;
        }

        final String captureTimestamp = CAPTURE_TIMESTAMPS.get(relativePath);
        if (captureTimestamp == null) {
            return requestUri;
        }

        return WAYBACK_BASE_URL
                + captureTimestamp
                + "id_/"
                + requestUri;
    }

    private static Map<String, String> createCaptureTimestamps() {
        final ArrayMap<String, String> result = new ArrayMap<>(85);
        result.put(
                "af/Blackberry_1305_r1-2_AFlsUN_xt9_ALM3.zip",
                "20240326165114");
        result.put(
                "am/Blackberry_1305_r1-1_AMlsUN_xt9.zip",
                "20240326165153");
        result.put(
                "as/Blackberry_1305_r1-6_ASlsUN_xt9_ALM3.zip",
                "20240326175609");
        result.put(
                "az/Blackberry_1305_r1-2_AZlsUN_xt9_ALM3.zip",
                "20240326172520");
        result.put(
                "be/Blackberry_1305_r1-2_BElsUN_xt9_ALM3.zip",
                "20240326165237");
        result.put(
                "bg/Blackberry_1305_r1-4_BGlsUN_xt9_ALM3.zip",
                "20240326165413");
        result.put(
                "bn/Blackberry_1305_r1-7_BNlsUN_xt9_ALM3.zip",
                "20240326180028");
        result.put(
                "bo/Blackberry_1305_r1-2_BOlsUN_xt9_2.zip",
                "20240326172608");
        result.put(
                "bs/Blackberry_1305_r1-6_BSlsUN_xt9_ALM3.zip",
                "20240326172648");
        result.put(
                "ca/Blackberry_1305_r1-7_CAlsUN_xt9_ALM3.zip",
                "20240326172732");
        result.put(
                "cs/Blackberry_1305_r1-5_CSlsUN_xt9_ALM3.zip",
                "20240326165458");
        result.put(
                "cy/Blackberry_1305_r1-1_CYlsUN_xt9_2.zip",
                "20240326165544");
        result.put(
                "da/Blackberry_1305_r1-6_DAusUN_xt9_ALM3.zip",
                "20240326165625");
        result.put(
                "el/Blackberry_1305_r1-5_ELusUN_xt9_ALM3.zip",
                "20240326165711");
        result.put(
                "en_AU/Blackberry_1305_r1-9_ENubUNAU_xt9_ALM3.zip",
                "20240326180111");
        result.put(
                "en_ZH/Blackberry_1305_r1-3_ENubUNZH_xt9_2.zip",
                "20240326174720");
        result.put(
                "es_419/Blackberry_1305_r1-11_ESusUNlatam_xt9_ALM3.zip",
                "20240326171917");
        result.put(
                "es_ES/Blackberry_1305_r1-12_ESusUNES_xt9_ALM3.zip",
                "20240326171829");
        result.put(
                "et/Blackberry_1305_r1-4_ETlsUN_xt9_ALM3.zip",
                "20240326165756");
        result.put(
                "eu/Blackberry_1305_r1-3_EUlsUN_xt9_ALM3.zip",
                "20240326165840");
        result.put(
                "fa/Blackberry_1305_r1-6_FAlsUN_xt9_ALM3.zip",
                "20240326174802");
        result.put(
                "fi/Blackberry_1305_r1-4_FIusUN_xt9_HC_ALM3.zip",
                "20240326172815");
        result.put(
                "fr_CA/Blackberry_1305_r1-6_FRusUNCA_xt9_ALM3.zip",
                "20240326175653");
        result.put(
                "ga/Blackberry_1305_r1-2_GAlsUN_xt9_ALM3.zip",
                "20240326172905");
        result.put(
                "gl/Blackberry_1305_r1-4_GLlsUN_xt9_ALM3.zip",
                "20240326165926");
        result.put(
                "gu/Blackberry_1305_r1-6_GUlsUN_xt9_ALM3.zip",
                "20240326174859");
        result.put(
                "ha/Blackberry_1305_r1-1_HAlsUN_xt9_2.zip",
                "20240326170009");
        result.put(
                "hi/Blackberry_1305_r1-17_HIlsUN_xt9_ALM3.zip",
                "20240326172220");
        result.put(
                "hr/Blackberry_1305_r1-4_HRlsUN_xt9_ALM3.zip",
                "20240326170049");
        result.put(
                "hu/Blackberry_1305_r1-4_HUlsUN_xt9_HC_ALM3.zip",
                "20240326175315");
        result.put(
                "hy/Blackberry_1305_r1-2_HYlsUN_xt9_ALM3.zip",
                "20240326173039");
        result.put(
                "in/Blackberry_1305_r1-6_IDlbUN_xt9_ALM3.zip",
                "20240326173123");
        result.put(
                "is/Blackberry_1305_r1-4_ISlsUN_xt9_ALM3.zip",
                "20240326170132");
        result.put(
                "iw/Blackberry_1305_r1-6_HElsUN_xt9_ALM3.zip",
                "20240326172948");
        result.put(
                "jv/Blackberry_1305_r1-2_JWlsUN_xt9_ALM3.zip",
                "20240326170346");
        result.put(
                "ka/Blackberry_1305_r1-3_KAlsUN_xt9_ALM3.zip",
                "20240326174945");
        result.put(
                "kk/Blackberry_1305_r1-2_KKlsUN_xt9_ALM3.zip",
                "20240326170427");
        result.put(
                "km/Blackberry_1305_r1-9_KMlsUN_xt9_ALM3.zip",
                "20240326180156");
        result.put(
                "kn/Blackberry_1305_r1-2_KNlsUN_xt9_ALM3.zip",
                "20240326173210");
        result.put(
                "ko/Blackberry_1305_r1-31_KOusUN_xt9_ALM3.zip",
                "20240326172304");
        result.put(
                "ks/Blackberry_1305_r1-2_KSlsUNdevanagari_xt9_ALM3.zip",
                "20240326173257");
        result.put(
                "ku/Blackberry_1305_r1-1_KUusUN_xt9_2.zip",
                "20240326170510");
        result.put(
                "ky/Blackberry_1305_r1-2_KYlsUN_xt9_ALM3.zip",
                "20240326173337");
        result.put(
                "ln/Blackberry_1305_r1-1_LNlsUN_xt9_2.zip",
                "20240326170551");
        result.put(
                "lo/Blackberry_1305_r1-3_LOlsUN_xt9_ALM3.zip",
                "20240326175031");
        result.put(
                "lt/Blackberry_1305_r1-5_LTlsUN_xt9_ALM3.zip",
                "20240326173423");
        result.put(
                "lv/Blackberry_1305_r1-4_LVlsUN_xt9_ALM3.zip",
                "20240326170633");
        result.put(
                "mg/Blackberry_1305_r1-1_MGlsUN_xt9_2.zip",
                "20240326170716");
        result.put(
                "ml/Blackberry_1305_r1-6_MLlsUN_xt9_ALM3.zip",
                "20240326173510");
        result.put(
                "mn/Blackberry_1305_r1-2_MNlsUN_xt9_ALM3.zip",
                "20240326173612");
        result.put(
                "mr/Blackberry_1305_r1-7_MRlsUN_xt9_ALM3.zip",
                "20240326175400");
        result.put(
                "my/Blackberry_1305_r1-2_MYlsUN_xt9_ALM3.zip",
                "20240326173651");
        result.put(
                "ne/Blackberry_1305_r1-4_NElsUN_xt9_ALM3.zip",
                "20240326175447");
        result.put(
                "or/Blackberry_1305_r1-5_ORlsUN_xt9_ALM3.zip",
                "20240326175815");
        result.put(
                "pa/Blackberry_1305_r1-5_PAlsUN_xt9_ALM3.zip",
                "20240326175855");
        result.put(
                "pt/Blackberry_1305_r1-11_PTusUN_xt9_ALM3.zip",
                "20240326171956");
        result.put(
                "pt_BR/Blackberry_1305_r1-2_PTusUNBR_xt9_ALM3.zip",
                "20240326173735");
        result.put(
                "pt_PT/Blackberry_1305_r1-2_PTusUNPT_xt9_ALM3.zip",
                "20240326173818");
        result.put(
                "ro/Blackberry_1305_r1-5_ROlsUN_xt9_ALM3.zip",
                "20240326173906");
        result.put(
                "sa/Blackberry_1305_r1-2_SAlsUN_xt9_ALM3.zip",
                "20240326173957");
        result.put(
                "si/Blackberry_1305_r1-2_SIlsUNAlternate_xt9_ALM3.zip",
                "20240326174036");
        result.put(
                "sk/Blackberry_1305_r1-5_SKlsUN_xt9_ALM3.zip",
                "20240326171109");
        result.put(
                "sl/Blackberry_1305_r1-5_SLlsUN_xt9_ALM3.zip",
                "20240326174123");
        result.put(
                "sq/Blackberry_1305_r1-4_SQlsUN_xt9_ALM3.zip",
                "20240326171152");
        result.put(
                "sr/Blackberry_1305_r1-4_SRlsUN_xt9_ALM3.zip",
                "20240326171242");
        result.put(
                "st/Blackberry_1305_r1-1_STlbUN_xt9_2.zip",
                "20240326171328");
        result.put(
                "su/Blackberry_1305_r1-2_SUlsUN_xt9_ALM3.zip",
                "20240326171408");
        result.put(
                "sv/Blackberry_1305_r1-6_SVusUN_xt9_ALM3.zip",
                "20240326171453");
        result.put(
                "sw/Blackberry_1305_r1-2_SWlbUN_xt9_ALM3.zip",
                "20240326174212");
        result.put(
                "ta/Blackberry_1305_r1-8_TAlsUN_xt9_ALM3.zip",
                "20240326175946");
        result.put(
                "tg/Blackberry_1305_r1-2_TGlsUN_xt9_ALM3.zip",
                "20240326174256");
        result.put(
                "th/Blackberry_1305_r1-4_THlsUN_xt9_ALM3.zip",
                "20240326174333");
        result.put(
                "tk/Blackberry_1305_r1-2_TKlsUN_xt9_ALM3.zip",
                "20240326174424");
        result.put(
                "tl/Blackberry_1305_r1-7_TLlsUN_xt9_ALM3.zip",
                "20240326174506");
        result.put(
                "tr/Blackberry_1305_r1-3_TRlsUN_xt9_HC_ALM3.zip",
                "20240326175112");
        result.put(
                "tt/Blackberry_1305_r1-1_TTlsUNcyrillic_xt9_ALM3.zip",
                "20240326171535");
        result.put(
                "ug/Blackberry_1305_r1-1_UGlsUN_xt9_ALM3.zip",
                "20240326171616");
        result.put(
                "ur/Blackberry_1305_r1-6_URlsUN_xt9_ALM3.zip",
                "20240326175150");
        result.put(
                "uz/Blackberry_1305_r1-1_UZlsUN_xt9_2.zip",
                "20240326171707");
        result.put(
                "vi/Blackberry_1305_r1-8_VIlsUN_xt9_ALM3.zip",
                "20240326175231");
        result.put(
                "xh/Blackberry_1305_r1-2_XHlbUN_xt9_ALM3.zip",
                "20240326174554");
        result.put(
                "yo/Blackberry_1305_r1-1_YOlsUN_xt9_2.zip",
                "20240326171750");
        result.put(
                "zh_HK/Blackberry_1305_r1-22-2-5_ZHtbUNps_Big5HKSCS_bpmf_pinyin_CJ_xt9_big_ALM.zip",
                "20240326172434");
        result.put(
                "zh_TW/Blackberry_1305_r1-15-2-6_ZHtbUNps_Big5HKSCS_bpmf_pinyin_CJ_"
                        + "xt9_bigTW_ALM.zip",
                "20240326172351");
        result.put(
                "zu/Blackberry_1305_r1-2_ZUlbUN_xt9_ALM3.zip",
                "20240326174636");
        return result;
    }

    private static Set<String> createArchivePaths() {
        final ArraySet<String> result = new ArraySet<>(9);

        result.add(
                "ar/Blackberry_1305_r1-12_ARlsUN_xt9_ALM3.zip");
        result.add(
                "ig/Blackberry_1305_r1-5_IGlsUN_xt9.zip");
        result.add(
                "ja/Blackberry_JAlsUNkana_conv_xt9_ALM3.zip");
        result.add(
                "mk/Blackberry_1305_r1-2_MKlsUN_xt9_ALM3.zip");
        result.add(
                "ms/Blackberry_1305_r1-4_MSlbUN_xt9_ALM3.zip");
        result.add(
                "nb/Blackberry_1305_r1-6_NOusUN_xt9_ALM3.zip");
        result.add(
                "nl/Blackberry_1305_r1-6_NLusUN_xt9_ALM3.zip");
        result.add(
                "pl/Blackberry_1305_r1-6_PLusUN_xt9_ALM3.zip");
        result.add(
                "ps/Blackberry_1305_r1-1_PSlsUN_xt9_2.zip");
        result.add(
                "te/Blackberry_1305_r1-6_TElsUN_xt9_ALM3.zip");

        return result;
    }
}
