package j70;

import b5.j;
import b5.k;
import f3.m;
import fr.t;
import java.util.Locale;
import mx.Label;
import n4.f0;
import n4.g0;
import oq.i0;
import oq.p;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import p076m2.g4;
import p076m2.r;
import q4.TextLayoutResult;
import q4.TextStyle;
import t70.i;
import u4.FontWeight;
import u4.l;
import u4.y;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a«\u0002\u0010-\u001a\u00020\"2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 2\b\b\u0002\u0010%\u001a\u00020$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\u001b2\b\b\u0002\u0010*\u001a\u00020\u001b2\b\b\u0002\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b-\u0010.\u001a\u001f\u00100\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b0\u00101\u001a\u0013\u00102\u001a\u00020\u001b*\u00020$H\u0003¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Lf3/m;", "modifier", "", "testTag", "Lmx/a;", AnnotatedPrivateKey.LABEL, "labelContentDescription", "Lq4/e;", "annotatedContent", "Landroidx/compose/ui/graphics/Color;", "color", "Lc5/v;", "fontSize", "Lu4/y;", "fontStyle", "Lu4/d0;", "fontWeight", "Lu4/l;", "fontFamily", "letterSpacing", "Lb5/k;", "textDecoration", "Lb5/j;", "textAlign", "lineHeight", "Lb5/v;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lkotlin/Function1;", "Lq4/t3;", "Loq/i0;", "onTextLayout", "Lq4/b4;", "style", "indexTag", "", "focusIndex", "canAddFocusable", "ignoreForAccessibility", "Lj70/a;", "accessibilityReadMode", "g", "(Lf3/m;Ljava/lang/String;Lmx/a;Lmx/a;Lq4/e;JJLu4/y;Lu4/d0;Lu4/l;JLb5/k;Lb5/j;JIZIILer/l;Lq4/b4;Ljava/lang/Integer;Ljava/lang/Float;ZZLj70/a;Lm2/r;IIII)V", "text", "n", "(Ljava/lang/String;Lj70/a;)Ljava/lang/String;", "o", "(Lq4/b4;Lm2/r;I)Z", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99894a;

        static {
            int[] iArr = new int[j70.a.values().length];
            try {
                iArr[j70.a.LOWER_CASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j70.a.LETTER_BY_LETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j70.a.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f99894a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x0137  */
    /* JADX WARN: Code duplicated, block: B:107:0x0141  */
    /* JADX WARN: Code duplicated, block: B:108:0x0144  */
    /* JADX WARN: Code duplicated, block: B:112:0x014c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0155  */
    /* JADX WARN: Code duplicated, block: B:115:0x0159  */
    /* JADX WARN: Code duplicated, block: B:117:0x0163  */
    /* JADX WARN: Code duplicated, block: B:118:0x0165  */
    /* JADX WARN: Code duplicated, block: B:120:0x0168  */
    /* JADX WARN: Code duplicated, block: B:123:0x0173  */
    /* JADX WARN: Code duplicated, block: B:125:0x017a  */
    /* JADX WARN: Code duplicated, block: B:127:0x017e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0188  */
    /* JADX WARN: Code duplicated, block: B:130:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0193  */
    /* JADX WARN: Code duplicated, block: B:136:0x019a  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:159:0x01df  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:162:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:167:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:169:0x0202  */
    /* JADX WARN: Code duplicated, block: B:171:0x0208  */
    /* JADX WARN: Code duplicated, block: B:172:0x020b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0215  */
    /* JADX WARN: Code duplicated, block: B:177:0x021a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0220  */
    /* JADX WARN: Code duplicated, block: B:181:0x0226  */
    /* JADX WARN: Code duplicated, block: B:182:0x0229  */
    /* JADX WARN: Code duplicated, block: B:186:0x0233  */
    /* JADX WARN: Code duplicated, block: B:187:0x0238  */
    /* JADX WARN: Code duplicated, block: B:189:0x023e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0244  */
    /* JADX WARN: Code duplicated, block: B:192:0x0247  */
    /* JADX WARN: Code duplicated, block: B:196:0x0251  */
    /* JADX WARN: Code duplicated, block: B:197:0x0256  */
    /* JADX WARN: Code duplicated, block: B:199:0x025c  */
    /* JADX WARN: Code duplicated, block: B:201:0x0262  */
    /* JADX WARN: Code duplicated, block: B:202:0x0265  */
    /* JADX WARN: Code duplicated, block: B:206:0x026f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0275  */
    /* JADX WARN: Code duplicated, block: B:211:0x027e  */
    /* JADX WARN: Code duplicated, block: B:213:0x0283  */
    /* JADX WARN: Code duplicated, block: B:216:0x028b  */
    /* JADX WARN: Code duplicated, block: B:217:0x0290  */
    /* JADX WARN: Code duplicated, block: B:219:0x0296  */
    /* JADX WARN: Code duplicated, block: B:221:0x029c  */
    /* JADX WARN: Code duplicated, block: B:222:0x029f  */
    /* JADX WARN: Code duplicated, block: B:224:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:227:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:229:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:231:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:233:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:234:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:238:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:239:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:241:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:243:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:244:0x02df  */
    /* JADX WARN: Code duplicated, block: B:246:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:249:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:250:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:252:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:254:0x0301  */
    /* JADX WARN: Code duplicated, block: B:256:0x0308  */
    /* JADX WARN: Code duplicated, block: B:259:0x0312  */
    /* JADX WARN: Code duplicated, block: B:260:0x0315  */
    /* JADX WARN: Code duplicated, block: B:262:0x031b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:263:0x031d  */
    /* JADX WARN: Code duplicated, block: B:264:0x031f  */
    /* JADX WARN: Code duplicated, block: B:267:0x0329  */
    /* JADX WARN: Code duplicated, block: B:269:0x032e  */
    /* JADX WARN: Code duplicated, block: B:272:0x033a  */
    /* JADX WARN: Code duplicated, block: B:278:0x034c  */
    /* JADX WARN: Code duplicated, block: B:281:0x0355  */
    /* JADX WARN: Code duplicated, block: B:283:0x035c  */
    /* JADX WARN: Code duplicated, block: B:294:0x03a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:295:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:296:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:298:0x03af  */
    /* JADX WARN: Code duplicated, block: B:299:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:301:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:303:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:304:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:306:0x03be  */
    /* JADX WARN: Code duplicated, block: B:309:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:311:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:312:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:314:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:315:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:317:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:318:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:320:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:321:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:323:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:324:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:326:0x0403  */
    /* JADX WARN: Code duplicated, block: B:327:0x0406  */
    /* JADX WARN: Code duplicated, block: B:329:0x040a  */
    /* JADX WARN: Code duplicated, block: B:330:0x040d  */
    /* JADX WARN: Code duplicated, block: B:332:0x0411  */
    /* JADX WARN: Code duplicated, block: B:334:0x0419  */
    /* JADX WARN: Code duplicated, block: B:335:0x0420  */
    /* JADX WARN: Code duplicated, block: B:337:0x0424  */
    /* JADX WARN: Code duplicated, block: B:338:0x0427  */
    /* JADX WARN: Code duplicated, block: B:340:0x042b  */
    /* JADX WARN: Code duplicated, block: B:341:0x042f  */
    /* JADX WARN: Code duplicated, block: B:343:0x0433  */
    /* JADX WARN: Code duplicated, block: B:344:0x0436  */
    /* JADX WARN: Code duplicated, block: B:346:0x043a  */
    /* JADX WARN: Code duplicated, block: B:348:0x0446  */
    /* JADX WARN: Code duplicated, block: B:350:0x0452  */
    /* JADX WARN: Code duplicated, block: B:353:0x0458  */
    /* JADX WARN: Code duplicated, block: B:354:0x046b  */
    /* JADX WARN: Code duplicated, block: B:356:0x0471  */
    /* JADX WARN: Code duplicated, block: B:357:0x0473  */
    /* JADX WARN: Code duplicated, block: B:359:0x0477  */
    /* JADX WARN: Code duplicated, block: B:360:0x047a  */
    /* JADX WARN: Code duplicated, block: B:362:0x047e  */
    /* JADX WARN: Code duplicated, block: B:363:0x0481  */
    /* JADX WARN: Code duplicated, block: B:365:0x0485  */
    /* JADX WARN: Code duplicated, block: B:366:0x0488  */
    /* JADX WARN: Code duplicated, block: B:368:0x048c  */
    /* JADX WARN: Code duplicated, block: B:369:0x0499  */
    /* JADX WARN: Code duplicated, block: B:372:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:373:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:375:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:377:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:378:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:381:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:385:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:387:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:388:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:390:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:393:0x0501  */
    /* JADX WARN: Code duplicated, block: B:395:0x0512  */
    /* JADX WARN: Code duplicated, block: B:397:0x0518  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:400:0x0526  */
    /* JADX WARN: Code duplicated, block: B:402:0x052e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:403:0x0530  */
    /* JADX WARN: Code duplicated, block: B:405:0x0536  */
    /* JADX WARN: Code duplicated, block: B:409:0x0545  */
    /* JADX WARN: Code duplicated, block: B:411:0x0559  */
    /* JADX WARN: Code duplicated, block: B:413:0x0572  */
    /* JADX WARN: Code duplicated, block: B:416:0x0589  */
    /* JADX WARN: Code duplicated, block: B:418:0x058c  */
    /* JADX WARN: Code duplicated, block: B:419:0x0591  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:423:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:426:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:427:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:430:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:431:0x05df  */
    /* JADX WARN: Code duplicated, block: B:434:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:435:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:438:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:439:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:442:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:444:0x0600  */
    /* JADX WARN: Code duplicated, block: B:447:0x061b  */
    /* JADX WARN: Code duplicated, block: B:449:0x062d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:451:0x0642  */
    /* JADX WARN: Code duplicated, block: B:454:0x06be  */
    /* JADX WARN: Code duplicated, block: B:456:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:459:0x0727  */
    /* JADX WARN: Code duplicated, block: B:461:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x010a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:96:0x011f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0122  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:360:0x047a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final void g(f3.m r48, java.lang.String r49, mx.Label r50, mx.Label r51, q4.e r52, long r53, long r55, u4.y r57, u4.FontWeight r58, u4.l r59, long r60, b5.k r62, b5.j r63, long r64, int r66, boolean r67, int r68, int r69, er.l<? super q4.TextLayoutResult, oq.i0> r70, q4.TextStyle r71, java.lang.Integer r72, java.lang.Float r73, boolean r74, boolean r75, j70.a r76, p076m2.r r77, final int r78, final int r79, final int r80, final int r81) {
        /*
            Method dump skipped, instruction units count: 1855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j70.h.g(f3.m, java.lang.String, mx.a, mx.a, q4.e, long, long, u4.y, u4.d0, u4.l, long, b5.k, b5.j, long, int, boolean, int, int, er.l, q4.b4, java.lang.Integer, java.lang.Float, boolean, boolean, j70.a, m2.r, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(TextLayoutResult textLayoutResult) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(n4.i0 i0Var) {
        i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(n4.i0 i0Var) {
        g0.a(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    public static final i0 k(String str, Label label, Float f15, Integer num, n4.i0 i0Var) {
        String string;
        String tag;
        String string2;
        if (str == null) {
            String str2 = "";
            if (label == null || (tag = label.getTag()) == null) {
                string = null;
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(tag);
                if (num != null) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append('_');
                    sb6.append(num.intValue());
                    string2 = sb6.toString();
                    if (string2 == null) {
                        string2 = "";
                    }
                } else {
                    string2 = "";
                }
                sb5.append(string2);
                string = sb5.toString();
            }
            if (string == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Undefined");
                if (num != null) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append('_');
                    sb8.append(num.intValue());
                    String string3 = sb8.toString();
                    if (string3 != null) {
                        str2 = string3;
                    }
                }
                sb7.append(str2);
                str = sb7.toString();
            } else {
                str = string;
            }
        }
        f0.y0(i0Var, str);
        if (f15 != null) {
            f0.I0(i0Var, f15.floatValue());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(n4.i0 i0Var) {
        f0.t(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(m mVar, String str, Label label, Label label2, q4.e eVar, long j15, long j16, y yVar, FontWeight fontWeight, l lVar, long j17, k kVar, j jVar, long j18, int i15, boolean z15, int i16, int i17, er.l lVar2, TextStyle textStyle, Integer num, Float f15, boolean z16, boolean z17, j70.a aVar, int i18, int i19, int i25, int i26, r rVar, int i27) {
        g(mVar, str, label, label2, eVar, j15, j16, yVar, fontWeight, lVar, j17, kVar, jVar, j18, i15, z15, i16, i17, lVar2, textStyle, num, f15, z16, z17, aVar, rVar, g4.a(i18 | 1), g4.a(i19), g4.a(i25), i26);
        return i0.f148189a;
    }

    private static final String n(String str, j70.a aVar) {
        String string = fu.r.u1(str).toString();
        Label.Companion companion = Label.INSTANCE;
        if (t.c(string, companion.b().getText())) {
            return c70.a.f23835a.a().g().getText();
        }
        int i15 = a.f99894a[aVar.ordinal()];
        if (i15 == 1) {
            return str.toLowerCase(Locale.ROOT);
        }
        if (i15 == 2) {
            return dz.e.h(fu.r.P(str.toLowerCase(Locale.ROOT), " ", "", false, 4, null), 1, companion.d());
        }
        if (i15 == 3) {
            return str;
        }
        throw new p();
    }

    private static final boolean o(TextStyle textStyle, r rVar, int i15) {
        boolean zC;
        if (p076m2.t.k()) {
            p076m2.t.o(489630856, i15, -1, "pl.gov.coi.common.ui.text.isHeader (CustomText.kt:150)");
        }
        k70.a aVar = k70.a.f108864a;
        int i16 = k70.a.f108865b;
        boolean zC2 = true;
        if (t.c(textStyle, aVar.f(rVar, i16).g())) {
            rVar.X(883947718);
            rVar.R();
            zC = true;
        } else {
            rVar.X(-1911147061);
            zC = t.c(textStyle, aVar.f(rVar, i16).i());
            rVar.R();
        }
        if (zC) {
            rVar.X(883947718);
            rVar.R();
        } else {
            rVar.X(-1911145814);
            if (t.c(textStyle, aVar.f(rVar, i16).j())) {
                rVar.X(884023141);
                rVar.R();
            } else {
                rVar.X(-1911144596);
                zC2 = t.c(textStyle, aVar.f(rVar, i16).h());
                rVar.R();
            }
            rVar.R();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return zC2;
    }
}
