package x1;

import android.graphics.PointF;
import androidx.compose.ui.platform.f3;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p079n1.k6;
import p079n1.s3;
import q4.TextLayoutResult;
import q4.a4;
import q4.m3;
import q4.q3;
import q4.z3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0017\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001b\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001e\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010#\u001a\u00020\u0005*\u00020\u00102\u0006\u0010 \u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001b\u0010&\u001a\u00020\u0006*\u00020%2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b&\u0010'\u001a7\u0010+\u001a\u00020\u0000*\u0004\u0018\u00010(2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b+\u0010,\u001a/\u0010-\u001a\u00020\u0005*\u00020(2\u0006\u0010 \u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b-\u0010.\u001a9\u00101\u001a\u00020\u0000*\u0004\u0018\u00010%2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b1\u00102\u001a%\u00104\u001a\u00020\u0005*\u00020(2\u0006\u00103\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b4\u00105\u001a#\u00109\u001a\u0002072\u0012\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020706\"\u000207H\u0002¢\u0006\u0004\b9\u0010:\u001a\u001f\u0010=\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0000H\u0002¢\u0006\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lq4/z3;", "", "text", "j", "(JLjava/lang/CharSequence;)J", "", "", "u", "(I)Z", "w", "x", "v", "Landroid/graphics/PointF;", "Lm3/e;", "z", "(Landroid/graphics/PointF;)J", "Ln1/s3;", "Lm3/g;", "rectInScreen", "Lq4/m3;", "granularity", "Lq4/q3;", "inclusionStrategy", "r", "(Ln1/s3;Lm3/g;ILq4/q3;)J", "startRectInScreen", "endRectInScreen", "s", "(Ln1/s3;Lm3/g;Lm3/g;ILq4/q3;)J", "offset", "y", "(Ljava/lang/CharSequence;I)J", "pointInScreen", "Landroidx/compose/ui/platform/f3;", "viewConfiguration", "n", "(Ln1/s3;JLandroidx/compose/ui/platform/f3;)I", "Lq4/t3;", "t", "(Lq4/t3;I)Z", "Lq4/q;", "Le4/b0;", "layoutCoordinates", "q", "(Lq4/q;Lm3/g;Le4/b0;ILq4/q3;)J", "o", "(Lq4/q;JLe4/b0;Landroidx/compose/ui/platform/f3;)I", "startPointInScreen", "endPointerInScreen", "p", "(Lq4/t3;JJLe4/b0;Landroidx/compose/ui/platform/f3;)J", "localPoint", "m", "(Lq4/q;JLandroidx/compose/ui/platform/f3;)I", "", "Lv4/j;", "editCommands", "k", "([Lv4/j;)Lv4/j;", "a", "b", "l", "(JJ)J", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a1 {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"x1/a1$a", "Lv4/j;", "Lv4/n;", "buffer", "Loq/i0;", "a", "(Lv4/n;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements v4.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v4.j[] f216300a;

        a(v4.j[] jVarArr) {
            this.f216300a = jVarArr;
        }

        @Override // v4.j
        public void a(v4.n buffer) {
            for (v4.j jVar : this.f216300a) {
                jVar.a(buffer);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j15, CharSequence charSequence) {
        int iN = z3.n(j15);
        int i15 = z3.i(j15);
        int iCodePointBefore = iN > 0 ? Character.codePointBefore(charSequence, iN) : 10;
        int iCodePointAt = i15 < charSequence.length() ? Character.codePointAt(charSequence, i15) : 10;
        if (x(iCodePointBefore) && (w(iCodePointAt) || v(iCodePointAt))) {
            do {
                iN -= Character.charCount(iCodePointBefore);
                if (iN == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iN);
            } while (x(iCodePointBefore));
            return a4.b(iN, i15);
        }
        if (!x(iCodePointAt)) {
            return j15;
        }
        if (!w(iCodePointBefore) && !v(iCodePointBefore)) {
            return j15;
        }
        do {
            i15 += Character.charCount(iCodePointAt);
            if (i15 == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, i15);
        } while (x(iCodePointAt));
        return a4.b(iN, i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v4.j k(v4.j... jVarArr) {
        return new a(jVarArr);
    }

    private static final long l(long j15, long j16) {
        return a4.b(Math.min(z3.n(j15), z3.n(j15)), Math.max(z3.i(j16), z3.i(j16)));
    }

    private static final int m(q4.q qVar, long j15, f3 f3Var) {
        float fH = f3Var != null ? f3Var.h() : 0.0f;
        int i15 = (int) (BodyPartID.bodyIdMax & j15);
        int iT = qVar.t(Float.intBitsToFloat(i15));
        if (Float.intBitsToFloat(i15) >= qVar.y(iT) - fH && Float.intBitsToFloat(i15) <= qVar.o(iT) + fH) {
            int i16 = (int) (j15 >> 32);
            if (Float.intBitsToFloat(i16) >= (-fH) && Float.intBitsToFloat(i16) <= qVar.getWidth() + fH) {
                return iT;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(s3 s3Var, long j15, f3 f3Var) {
        TextLayoutResult value;
        q4.q multiParagraph;
        k6 k6VarN = s3Var.n();
        if (k6VarN == null || (value = k6VarN.getValue()) == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return -1;
        }
        return o(multiParagraph, j15, s3Var.m(), f3Var);
    }

    private static final int o(q4.q qVar, long j15, p036e4.b0 b0Var, f3 f3Var) {
        long jH;
        int iM;
        if (b0Var == null || (iM = m(qVar, (jH = b0Var.h(j15)), f3Var)) == -1) {
            return -1;
        }
        return qVar.A(m3.e.g(jH, 0.0f, (qVar.y(iM) + qVar.o(iM)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p(TextLayoutResult textLayoutResult, long j15, long j16, p036e4.b0 b0Var, f3 f3Var) {
        if (textLayoutResult == null || b0Var == null) {
            return z3.INSTANCE.a();
        }
        long jH = b0Var.h(j15);
        long jH2 = b0Var.h(j16);
        int iM = m(textLayoutResult.getMultiParagraph(), jH, f3Var);
        int iM2 = m(textLayoutResult.getMultiParagraph(), jH2, f3Var);
        if (iM != -1) {
            if (iM2 != -1) {
                iM = Math.min(iM, iM2);
            }
            iM2 = iM;
        } else if (iM2 == -1) {
            return z3.INSTANCE.a();
        }
        float fV = (textLayoutResult.v(iM2) + textLayoutResult.m(iM2)) / 2;
        int i15 = (int) (jH >> 32);
        int i16 = (int) (jH2 >> 32);
        return textLayoutResult.getMultiParagraph().G(new m3.g(Math.min(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), fV - 0.1f, Math.max(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), fV + 0.1f), m3.INSTANCE.a(), q3.INSTANCE.g());
    }

    private static final long q(q4.q qVar, m3.g gVar, p036e4.b0 b0Var, int i15, q3 q3Var) {
        return (qVar == null || b0Var == null) ? z3.INSTANCE.a() : qVar.G(gVar.u(b0Var.h(m3.e.INSTANCE.c())), i15, q3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long r(s3 s3Var, m3.g gVar, int i15, q3 q3Var) {
        TextLayoutResult value;
        k6 k6VarN = s3Var.n();
        return q((k6VarN == null || (value = k6VarN.getValue()) == null) ? null : value.getMultiParagraph(), gVar, s3Var.m(), i15, q3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long s(s3 s3Var, m3.g gVar, m3.g gVar2, int i15, q3 q3Var) {
        long jR = r(s3Var, gVar, i15, q3Var);
        if (z3.h(jR)) {
            return z3.INSTANCE.a();
        }
        long jR2 = r(s3Var, gVar2, i15, q3Var);
        return z3.h(jR2) ? z3.INSTANCE.a() : l(jR, jR2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(TextLayoutResult textLayoutResult, int i15) {
        int iQ = textLayoutResult.q(i15);
        if (i15 == textLayoutResult.u(iQ) || i15 == TextLayoutResult.p(textLayoutResult, iQ, false, 2, null)) {
            return textLayoutResult.y(i15) != textLayoutResult.c(i15);
        }
        return textLayoutResult.c(i15) != textLayoutResult.c(i15 - 1);
    }

    private static final boolean u(int i15) {
        int type = Character.getType(i15);
        return type == 14 || type == 13 || i15 == 10;
    }

    private static final boolean v(int i15) {
        int type = Character.getType(i15);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    private static final boolean w(int i15) {
        return Character.isWhitespace(i15) || i15 == 160;
    }

    private static final boolean x(int i15) {
        return w(i15) && !u(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long y(CharSequence charSequence, int i15) {
        int iCharCount = i15;
        while (iCharCount > 0) {
            int iC = g.c(charSequence, iCharCount);
            if (!w(iC)) {
                break;
            }
            iCharCount -= Character.charCount(iC);
        }
        while (i15 < charSequence.length()) {
            int iB = g.b(charSequence, i15);
            if (!w(iB)) {
                break;
            }
            i15 += g.a(iB);
        }
        return a4.b(iCharCount, i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long z(PointF pointF) {
        float f15 = pointF.x;
        float f16 = pointF.y;
        return m3.e.e((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f16)) & BodyPartID.bodyIdMax));
    }
}
