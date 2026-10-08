package com.google.android.libraries.places.internal;

import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.asn1.x509.DisplayText;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: loaded from: classes4.dex */
final class s2 implements ez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ez f33645a = new s2();

    private s2() {
    }

    @Override // com.google.android.libraries.places.internal.ez
    public final boolean b(int i15) {
        switch (i15) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case BERTags.DATE /* 31 */:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
            case 40:
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
            case EACTags.CURRENCY_CODE /* 42 */:
            case EACTags.DATE_OF_BIRTH /* 43 */:
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case EACTags.TRANSACTION_DATE /* 51 */:
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case 53:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
            case 55:
            case 56:
            case 57:
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
            case EACTags.APPLICATION_IMAGE /* 68 */:
            case EACTags.DISPLAY_IMAGE /* 69 */:
            case 70:
            case EACTags.MESSAGE_REFERENCE /* 71 */:
            case 72:
            case 73:
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
            case EACTags.DEPRECATED /* 75 */:
            case 76:
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
            case 78:
            case 79:
            case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
            case EACTags.ANSWER_TO_RESET /* 81 */:
            case EACTags.HISTORICAL_BYTES /* 82 */:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case CertificateBody.profileType /* 127 */:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA /* 140 */:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384 /* 157 */:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
            case DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE /* 200 */:
                return true;
            default:
                return false;
        }
    }
}
