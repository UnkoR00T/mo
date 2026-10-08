package p70;

import androidx.compose.ui.graphics.Color;
import er.p;
import i30.ButtonIconData;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0011JC\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lp70/g;", "", "<init>", "()V", "Lmx/a;", "navigationTitleLabel", "Lkotlin/Function0;", "Loq/i0;", "onBackButtonClick", "o", "(Lmx/a;Ler/a;Lm2/r;I)V", "Lq70/a;", "menuButtonType", "onMenuButtonClick", "q", "(Lmx/a;Lq70/a;Ler/a;Lm2/r;I)V", "k", "(Lmx/a;Ler/a;Lq70/a;Ler/a;Lm2/r;I)V", "i", "Lq70/b;", "titleSpanData", "g", "(Lmx/a;Ler/a;Lq70/a;Ler/a;Lq70/b;Lm2/r;I)V", "", "iconTitleResId", "m", "(Ler/a;ILm2/r;I)V", "b", "I", "backButtonResourceId", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f153260a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int backButtonResourceId = jz.a.U;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f153262c = 0;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f153263a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1975278232);
            if (t.k()) {
                t.o(-1975278232, i15, -1, "pl.gov.coi.common.ui.topMenu.TopBar.BackAndMenuButtonSpannableTitleTopBar.<anonymous> (TopBar.kt:122)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f153264a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1297803987);
            if (t.k()) {
                t.o(-1297803987, i15, -1, "pl.gov.coi.common.ui.topMenu.TopBar.BackAndMenuButtonSpannableTitleTopBar.<anonymous> (TopBar.kt:128)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f153265a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-736306333);
            if (t.k()) {
                t.o(-736306333, i15, -1, "pl.gov.coi.common.ui.topMenu.TopBar.BackAndMenuButtonStatusBarTopBar.<anonymous> (TopBar.kt:97)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f153266a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-2032928920);
            if (t.k()) {
                t.o(-2032928920, i15, -1, "pl.gov.coi.common.ui.topMenu.TopBar.BackAndMenuButtonStatusBarTopBar.<anonymous> (TopBar.kt:103)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f153267a = new e();

        e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(331082394);
            if (t.k()) {
                t.o(331082394, i15, -1, "pl.gov.coi.common.ui.topMenu.TopBar.BackAndMenuButtonTopBar.<anonymous> (TopBar.kt:55)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f153268a = new f();

        f() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(721765621);
            if (t.k()) {
                t.o(721765621, i15, -1, "pl.gov.coi.common.ui.topMenu.TopBar.BackAndMenuButtonTopBar.<anonymous> (TopBar.kt:61)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    /* JADX INFO: renamed from: p70.g$g, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3772g implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3772g f153269a = new C3772g();

        C3772g() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1815545027);
            if (t.k()) {
                t.o(1815545027, i15, -1, "pl.gov.coi.common.ui.topMenu.TopBar.BackButtonLogoTopBar.<anonymous> (TopBar.kt:141)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f153270a = new h();

        h() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1494858724);
            if (t.k()) {
                t.o(-1494858724, i15, -1, "pl.gov.coi.common.ui.topMenu.TopBar.BackButtonTopBar.<anonymous> (TopBar.kt:20)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f153271a = new i();

        i() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-101400448);
            if (t.k()) {
                t.o(-101400448, i15, -1, "pl.gov.coi.common.ui.topMenu.TopBar.MenuButtonTopBar.<anonymous> (TopBar.kt:37)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(g gVar, Label label, er.a aVar, q70.a aVar2, er.a aVar3, q70.b bVar, int i15, r rVar, int i16) {
        gVar.g(label, aVar, aVar2, aVar3, bVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(g gVar, Label label, er.a aVar, q70.a aVar2, er.a aVar3, int i15, r rVar, int i16) {
        gVar.i(label, aVar, aVar2, aVar3, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(g gVar, Label label, er.a aVar, q70.a aVar2, er.a aVar3, int i15, r rVar, int i16) {
        gVar.k(label, aVar, aVar2, aVar3, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(g gVar, er.a aVar, int i15, int i16, r rVar, int i17) {
        gVar.m(aVar, i15, rVar, g4.a(i16 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(g gVar, Label label, er.a aVar, int i15, r rVar, int i16) {
        gVar.o(label, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(g gVar, Label label, q70.a aVar, er.a aVar2, int i15, r rVar, int i16) {
        gVar.q(label, aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public final void g(final Label label, final er.a<i0> aVar, final q70.a aVar2, final er.a<i0> aVar3, final q70.b bVar, r rVar, final int i15) {
        int i16;
        er.a<i0> aVar4;
        g gVar;
        r rVar2;
        r rVarH = rVar.h(-222542490);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(label) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            aVar4 = aVar;
            i16 |= rVarH.G(aVar4) ? 32 : 16;
        } else {
            aVar4 = aVar;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.c(aVar2.ordinal()) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar3) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(bVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            gVar = this;
            i16 |= rVarH.W(gVar) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            gVar = this;
        }
        if (rVarH.r((74899 & i16) != 74898, i16 & 1)) {
            if (t.k()) {
                t.o(-222542490, i16, -1, "pl.gov.coi.common.ui.topMenu.TopBar.BackAndMenuButtonSpannableTitleTopBar (TopBar.kt:117)");
            }
            rVar2 = rVarH;
            n.g(null, null, label, bVar, null, 0L, new ButtonIconData(null, aVar2.getIconResId(), b.f153264a, null, aVar2.getContentDescription(), aVar3, 9, null), new ButtonIconData(null, backButtonResourceId, a.f153263a, null, c70.a.f23835a.a().R(), aVar4, 9, null), rVar2, ((i16 << 6) & 896) | ((i16 >> 3) & 7168), 51);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            final g gVar2 = gVar;
            d5VarM.a(new p() { // from class: p70.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.h(this.f153239a, label, aVar, aVar2, aVar3, bVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void i(final Label label, final er.a<i0> aVar, final q70.a aVar2, final er.a<i0> aVar3, r rVar, final int i15) {
        int i16;
        er.a<i0> aVar4;
        g gVar;
        r rVar2;
        r rVarH = rVar.h(1147567329);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(label) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            aVar4 = aVar;
            i16 |= rVarH.G(aVar4) ? 32 : 16;
        } else {
            aVar4 = aVar;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.c(aVar2.ordinal()) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar3) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            gVar = this;
            i16 |= rVarH.W(gVar) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            gVar = this;
        }
        if (rVarH.r((i16 & 9363) != 9362, i16 & 1)) {
            if (t.k()) {
                t.o(1147567329, i16, -1, "pl.gov.coi.common.ui.topMenu.TopBar.BackAndMenuButtonStatusBarTopBar (TopBar.kt:92)");
            }
            rVar2 = rVarH;
            n.g(null, null, label, null, null, 0L, new ButtonIconData(null, aVar2.getIconResId(), d.f153266a, null, aVar2.getContentDescription(), aVar3, 9, null), new ButtonIconData(null, backButtonResourceId, c.f153265a, null, c70.a.f23835a.a().R(), aVar4, 9, null), rVar2, (i16 << 6) & 896, 59);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            final g gVar2 = gVar;
            d5VarM.a(new p() { // from class: p70.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.j(this.f153246a, label, aVar, aVar2, aVar3, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void k(final Label label, final er.a<i0> aVar, final q70.a aVar2, final er.a<i0> aVar3, r rVar, final int i15) {
        int i16;
        er.a<i0> aVar4;
        g gVar;
        r rVar2;
        r rVarH = rVar.h(1909785436);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(label) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            aVar4 = aVar;
            i16 |= rVarH.G(aVar4) ? 32 : 16;
        } else {
            aVar4 = aVar;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.c(aVar2.ordinal()) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar3) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            gVar = this;
            i16 |= rVarH.W(gVar) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            gVar = this;
        }
        if (rVarH.r((i16 & 9363) != 9362, i16 & 1)) {
            if (t.k()) {
                t.o(1909785436, i16, -1, "pl.gov.coi.common.ui.topMenu.TopBar.BackAndMenuButtonTopBar (TopBar.kt:50)");
            }
            rVar2 = rVarH;
            n.g(null, null, label, null, null, 0L, new ButtonIconData(null, aVar2.getIconResId(), f.f153268a, null, aVar2.getContentDescription(), aVar3, 9, null), new ButtonIconData(null, backButtonResourceId, e.f153267a, null, c70.a.f23835a.a().R(), aVar4, 9, null), rVar2, (i16 << 6) & 896, 59);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            final g gVar2 = gVar;
            d5VarM.a(new p() { // from class: p70.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.l(this.f153233a, label, aVar, aVar2, aVar3, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void m(final er.a<i0> aVar, final int i15, r rVar, final int i16) {
        int i17;
        r rVar2;
        r rVarH = rVar.h(-1297187579);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.G(aVar) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVarH.c(i15) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(this) ? 256 : 128;
        }
        int i18 = i17;
        if (rVarH.r((i18 & 147) != 146, i18 & 1)) {
            if (t.k()) {
                t.o(-1297187579, i18, -1, "pl.gov.coi.common.ui.topMenu.TopBar.BackButtonLogoTopBar (TopBar.kt:137)");
            }
            rVar2 = rVarH;
            n.g(null, null, null, null, Integer.valueOf(i15), 0L, null, new ButtonIconData(null, backButtonResourceId, C3772g.f153269a, null, c70.a.f23835a.a().R(), aVar, 9, null), rVar2, (i18 << 9) & 57344, 111);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: p70.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.n(this.f153256a, aVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void o(final Label label, er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        final er.a<i0> aVar2;
        r rVar2;
        r rVarH = rVar.h(-95065217);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(label) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(this) ? 256 : 128;
        }
        int i17 = i16;
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (t.k()) {
                t.o(-95065217, i17, -1, "pl.gov.coi.common.ui.topMenu.TopBar.BackButtonTopBar (TopBar.kt:15)");
            }
            aVar2 = aVar;
            rVar2 = rVarH;
            n.g(null, null, label, null, null, 0L, null, new ButtonIconData(null, backButtonResourceId, h.f153270a, null, c70.a.f23835a.a().R(), aVar, 9, null), rVar2, (i17 << 6) & 896, 123);
            if (t.k()) {
                t.n();
            }
        } else {
            aVar2 = aVar;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: p70.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.p(this.f153252a, label, aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void q(final Label label, final q70.a aVar, final er.a<i0> aVar2, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-143193316);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(label) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.c(aVar.ordinal()) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar2) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(-143193316, i16, -1, "pl.gov.coi.common.ui.topMenu.TopBar.MenuButtonTopBar (TopBar.kt:32)");
            }
            n.g(null, null, label, null, null, 0L, new ButtonIconData(null, aVar.getIconResId(), i.f153271a, null, aVar.getContentDescription(), aVar2, 9, null), null, rVarH, (i16 << 6) & 896, 187);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: p70.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.r(this.f153228a, label, aVar, aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
