package y0;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f222525a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.v<f3.m, String, Boolean, ContextMenuColors, er.q<? super Color, ? super p076m2.r, ? super Integer, i0>, er.a<i0>, p076m2.r, Integer, i0> f222526b = y2.m.b(-1571120048, false, new er.v() { // from class: y0.a
        @Override // er.v
        public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            return c.f((f3.m) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (ContextMenuColors) obj4, (er.q) obj5, (er.a) obj6, (p076m2.r) obj7, ((Integer) obj8).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<ContextMenuColors, p076m2.r, Integer, i0> f222527c = y2.m.b(-1455401925, false, new er.q() { // from class: y0.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((ContextMenuColors) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(ContextMenuColors contextMenuColors, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(contextMenuColors) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1455401925, i15, -1, "androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt.lambda$-1455401925.<anonymous> (ContextMenuUi.kt:305)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            s sVar = s.f222582a;
            d1.r.b(w0.i.d(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.h(a3.p(companion, 0.0f, sVar.e(), 1, null), 0.0f, 1, null), sVar.d()), contextMenuColors.getIconColor(), null, 2, null), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(f3.m mVar, String str, boolean z15, ContextMenuColors contextMenuColors, er.q qVar, er.a aVar, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = (rVar.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVar.W(str) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVar.a(z15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVar.W(contextMenuColors) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVar.G(qVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i15 & 196608) == 0) {
            i16 |= rVar.G(aVar) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if (rVar.r((599187 & i16) != 599186, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1571120048, i16, -1, "androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt.lambda$-1571120048.<anonymous> (ContextMenuUi.kt:136)");
            }
            d0.n(str, z15, contextMenuColors, mVar, qVar, aVar, rVar, ((i16 >> 3) & 1022) | ((i16 << 9) & 7168) | (57344 & i16) | (i16 & 458752), 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<ContextMenuColors, p076m2.r, Integer, i0> c() {
        return f222527c;
    }

    public final er.v<f3.m, String, Boolean, ContextMenuColors, er.q<? super Color, ? super p076m2.r, ? super Integer, i0>, er.a<i0>, p076m2.r, Integer, i0> d() {
        return f222526b;
    }
}
