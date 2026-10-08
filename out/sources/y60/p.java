package y60;

import d1.e0;
import d1.m3;
import d1.q3;
import d1.r3;
import h30.ButtonData;
import h30.q;
import java.util.Arrays;
import l3.l0;
import mx.Label;
import n4.f0;
import n4.v;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.hd;
import p046f2.ik;
import p046f2.mk;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c4;
import p076m2.c6;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.r0;
import p076m2.s0;
import p076m2.t;
import t70.s;
import w0.q0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\b¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Ly60/c;", "mediaPlayerComponentData", "Loq/i0;", "m", "(Ly60/c;Lm2/r;I)V", "Lgu/b;", "", "C", "(J)Ljava/lang/String;", "B", "", "isSliderFocused", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"y60/p$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaPlayerComponentData f224411a;

        public a(MediaPlayerComponentData mediaPlayerComponentData) {
            this.f224411a = mediaPlayerComponentData;
        }

        @Override // p076m2.r0
        public void j() {
            this.f224411a.h().a();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f224412a;

        static {
            int[] iArr = new int[yx.b.values().length];
            try {
                iArr[yx.b.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yx.b.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yx.b.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[yx.b.ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f224412a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(MediaPlayerComponentData mediaPlayerComponentData, int i15, r rVar, int i16) {
        m(mediaPlayerComponentData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final String B(long j15) {
        gu.b.z(j15);
        int iG = gu.b.G(j15);
        int I = gu.b.I(j15);
        gu.b.H(j15);
        Label.Companion companion = Label.INSTANCE;
        Label labelC = companion.c();
        if (iG > 0) {
            labelC = labelC.o(c70.a.f23835a.a().T(iG, iG).o(companion.d()));
        }
        return labelC.o(c70.a.f23835a.a().H(I, I)).getText();
    }

    private static final String C(long j15) {
        gu.b.z(j15);
        int iG = gu.b.G(j15);
        int I = gu.b.I(j15);
        gu.b.H(j15);
        return String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iG), Integer.valueOf(I)}, 2));
    }

    public static final void m(final MediaPlayerComponentData mediaPlayerComponentData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-172650359);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(mediaPlayerComponentData) : rVarH.G(mediaPlayerComponentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-172650359, i16, -1, "pl.gov.coi.common.ui.player.MediaPlayerComponent (MediaPlayerComponent.kt:65)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = c6.e(Boolean.FALSE, null, 2, null);
                rVarH.v(objE);
            }
            final a3 a3Var = (a3) objE;
            x30.c.c(null, 0.0f, y2.m.d(524033068, true, new er.p() { // from class: y60.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.p(mediaPlayerComponentData, a3Var, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            i0 i0Var = i0.f148189a;
            boolean zG = rVarH.G(mediaPlayerComponentData);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new er.l() { // from class: y60.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.z(mediaPlayerComponentData, (s0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            Function0.a(i0Var, (er.l) objE2, rVarH, 6);
            m7.j.h(androidx.lifecycle.j.a.ON_PAUSE, null, mediaPlayerComponentData.d(), rVarH, 6, 2);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y60.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.A(mediaPlayerComponentData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean n(a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    private static final void o(a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final MediaPlayerComponentData mediaPlayerComponentData, final a3 a3Var, r rVar, int i15) {
        int i16;
        Label labelY;
        er.a<i0> aVarE;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(524033068, i15, -1, "pl.gov.coi.common.ui.player.MediaPlayerComponent.<anonymous>.<anonymous> (MediaPlayerComponent.kt:69)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Object objE = rVar.E();
            r.Companion companion4 = r.INSTANCE;
            if (objE == companion4.a()) {
                objE = new er.l() { // from class: y60.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.q((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = v.d(companion, false, (er.l) objE, 1, null);
            Label trackTitle = mediaPlayerComponentData.getTrackTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(mVarD, null, trackTitle, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).a(), null, null, false, false, null, rVar, 0, 0, 0, 33030138);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            w0 w0VarB = m3.b(iVar.j(), companion2.i(), rVar, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarH);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q3 q3Var = q3.f39261a;
            yx.b mediaPlayerPlaybackState = mediaPlayerComponentData.getMediaPlayerState().getMediaPlayerPlaybackState();
            int[] iArr = b.f224412a;
            int i18 = iArr[mediaPlayerPlaybackState.ordinal()];
            if (i18 == 1 || i18 == 2) {
                i16 = jz.a.V1;
            } else if (i18 == 3) {
                i16 = jz.a.X1;
            } else {
                if (i18 != 4) {
                    throw new oq.p();
                }
                i16 = jz.a.W1;
            }
            int i19 = iArr[mediaPlayerComponentData.getMediaPlayerState().getMediaPlayerPlaybackState().ordinal()];
            if (i19 == 1 || i19 == 2) {
                labelY = c70.a.f23835a.a().y();
            } else if (i19 == 3) {
                labelY = c70.a.f23835a.a().d0();
            } else {
                if (i19 != 4) {
                    throw new oq.p();
                }
                labelY = c70.a.f23835a.a().D0();
            }
            Label.Companion companion5 = Label.INSTANCE;
            k30.c.WithIcon withIcon = new k30.c.WithIcon(i16, labelY.o(companion5.d()).o(mediaPlayerComponentData.getTrackTitle()));
            k30.a.Large large = new k30.a.Large(false, 1, null);
            k30.d.a aVar2 = k30.d.a.f107773a;
            int i25 = iArr[mediaPlayerComponentData.getMediaPlayerState().getMediaPlayerPlaybackState().ordinal()];
            if (i25 == 1 || i25 == 2) {
                aVarE = mediaPlayerComponentData.e();
            } else if (i25 == 3) {
                aVarE = mediaPlayerComponentData.d();
            } else {
                if (i25 != 4) {
                    throw new oq.p();
                }
                aVarE = mediaPlayerComponentData.f();
            }
            q.p(new ButtonData(null, null, large, withIcon, aVar2, null, aVarE, 35, null), false, null, rVar, 48, 4);
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, companion);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB3);
            } else {
                rVar.u();
            }
            r rVarC3 = n6.c(rVar);
            n6.i(rVarC3, w0VarA2, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            d0.c(hd.f().d(c5.h.j(c5.h.n(0))), y2.m.d(2005282204, true, new er.p() { // from class: y60.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.r(mediaPlayerComponentData, a3Var, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, c4.f122821i | 48);
            f3.m mVarH2 = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            w0 w0VarB2 = m3.b(iVar.h(), companion2.l(), rVar, 6);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT4 = rVar.t();
            f3.m mVarE4 = f3.j.e(rVar, mVarH2);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB4);
            } else {
                rVar.u();
            }
            r rVarC4 = n6.c(rVar);
            n6.i(rVarC4, w0VarB2, companion3.d());
            n6.i(rVarC4, e0VarT4, companion3.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion3.c());
            n6.g(rVarC4, companion3.a());
            n6.i(rVarC4, mVarE4, companion3.e());
            Object objE2 = rVar.E();
            if (objE2 == companion4.a()) {
                objE2 = new er.l() { // from class: y60.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.x((n4.i0) obj);
                    }
                };
                rVar.v(objE2);
            }
            f3.m mVarD2 = v.d(companion, false, (er.l) objE2, 1, null);
            gu.b.Companion companion6 = gu.b.INSTANCE;
            long jF = gu.b.F(mediaPlayerComponentData.getCurrentPosition());
            gu.e eVar = gu.e.SECONDS;
            j70.h.g(mVarD2, null, mx.b.b(C(gu.d.r(jF, eVar)), "CURRENT_POSITION"), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).c(), null, null, false, false, null, rVar, 0, 0, 0, 33030138);
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            Object objE3 = rVar.E();
            if (objE3 == companion4.a()) {
                objE3 = new er.l() { // from class: y60.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.y((n4.i0) obj);
                    }
                };
                rVar.v(objE3);
            }
            j70.h.g(v.d(companion, false, (er.l) objE3, 1, null), null, companion5.b().o(mx.b.b(C(gu.d.r(gu.b.F(mediaPlayerComponentData.getMediaPlayerState().getMediaPlayerTotalDuration()) - gu.b.F(mediaPlayerComponentData.getCurrentPosition()), eVar)), "TIME_LEFT")), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).c(), null, null, false, false, null, rVar, 0, 0, 0, 33030138);
            rVar.x();
            rVar.x();
            rVar.x();
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final MediaPlayerComponentData mediaPlayerComponentData, final a3 a3Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(2005282204, i15, -1, "pl.gov.coi.common.ui.player.MediaPlayerComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MediaPlayerComponent.kt:108)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            boolean zG = rVar.G(mediaPlayerComponentData);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: y60.m
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.s(mediaPlayerComponentData, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarC = q0.c(v.d(companion, false, (er.l) objE, 1, null), true, null, 2, null);
            Object objE2 = rVar.E();
            r.Companion companion2 = r.INSTANCE;
            if (objE2 == companion2.a()) {
                objE2 = new er.l() { // from class: y60.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.u(a3Var, (l0) obj);
                    }
                };
                rVar.v(objE2);
            }
            f3.m mVarA = l3.e.a(mVarC, (er.l) objE2);
            float fA = gu.b.A(mediaPlayerComponentData.getCurrentPosition());
            lr.e<Float> eVarB = lr.m.b(0.0f, gu.b.A(mediaPlayerComponentData.getMediaPlayerState().getMediaPlayerTotalDuration()));
            boolean zG2 = rVar.G(mediaPlayerComponentData);
            Object objE3 = rVar.E();
            if (zG2 || objE3 == companion2.a()) {
                objE3 = new er.l() { // from class: y60.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.v(mediaPlayerComponentData, ((Float) obj).floatValue());
                    }
                };
                rVar.v(objE3);
            }
            ik.m(fA, (er.l) objE3, mVarA, false, null, null, null, 0, y2.m.d(-1864237088, true, new er.q() { // from class: y60.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.w(a3Var, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), y60.b.f224387a.b(), eVarB, rVar, 905969664, 0, 248);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final MediaPlayerComponentData mediaPlayerComponentData, n4.i0 i0Var) {
        yw.a aVarA = c70.a.f23835a.a();
        gu.b.Companion companion = gu.b.INSTANCE;
        long jF = gu.b.F(mediaPlayerComponentData.getCurrentPosition());
        gu.e eVar = gu.e.SECONDS;
        f0.x0(i0Var, aVarA.L(B(gu.d.r(jF, eVar)), B(gu.d.r(gu.b.F(mediaPlayerComponentData.getMediaPlayerState().getMediaPlayerTotalDuration()), eVar))).getText());
        f0.p0(i0Var, null, new er.l() { // from class: y60.f
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(p.t(mediaPlayerComponentData, ((Float) obj).floatValue()));
            }
        }, 1, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(MediaPlayerComponentData mediaPlayerComponentData, float f15) {
        mediaPlayerComponentData.g().b(Long.valueOf(Math.min(Math.max(0L, ((float) gu.b.A(mediaPlayerComponentData.getCurrentPosition())) > f15 ? gu.b.A(mediaPlayerComponentData.getCurrentPosition()) - 5000 : gu.b.A(mediaPlayerComponentData.getCurrentPosition()) + 5000), gu.b.A(mediaPlayerComponentData.getMediaPlayerState().getMediaPlayerTotalDuration()))));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(a3 a3Var, l0 l0Var) {
        o(a3Var, l0Var.b());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(MediaPlayerComponentData mediaPlayerComponentData, float f15) {
        mediaPlayerComponentData.g().b(Long.valueOf((long) f15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(a3 a3Var, mk mkVar, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-1864237088, i15, -1, "pl.gov.coi.common.ui.player.MediaPlayerComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MediaPlayerComponent.kt:138)");
            }
            f3.m mVarQ = s.q(f3.m.INSTANCE, n(a3Var), null, 2, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            d1.r.b(w0.i.d(androidx.compose.foundation.layout.d.t(k3.f.a(mVarQ, aVar.e(rVar, i16).getRadius300()), c5.h.n(28)), aVar.a(rVar, i16).getBase().getPrimary(), null, 2, null), rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 z(MediaPlayerComponentData mediaPlayerComponentData, s0 s0Var) {
        mediaPlayerComponentData.b().a();
        return new a(mediaPlayerComponentData);
    }
}
