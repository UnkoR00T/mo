package androidx.compose.ui.window;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.g1;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import n4.f0;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.a2;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r0;
import p076m2.s0;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "onDismissRequest", "Landroidx/compose/ui/window/l;", "properties", "content", "a", "(Ler/a;Landroidx/compose/ui/window/l;Ler/p;Lm2/r;II)V", "Lf3/m;", "modifier", "c", "(Lf3/m;Ler/p;Lm2/r;II)V", "currentContent", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: androidx.compose.ui.window.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm2/s0;", "Lm2/r0;", "c", "(Lm2/s0;)Lm2/r0;"}, k = 3, mv = {2, 1, 0})
    static final class C0240a extends fr.w implements er.l<s0, r0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f11025b;

        /* JADX INFO: renamed from: androidx.compose.ui.window.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/a$a$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0241a implements r0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f11026a;

            public C0241a(m mVar) {
                this.f11026a = mVar;
            }

            @Override // p076m2.r0
            public void j() {
                this.f11026a.dismiss();
                this.f11026a.t();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0240a(m mVar) {
            super(1);
            this.f11025b = mVar;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final r0 b(s0 s0Var) {
            this.f11025b.show();
            return new C0241a(this.f11025b);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f11027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f11028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l f11029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c5.t f11030e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m mVar, er.a<i0> aVar, l lVar, c5.t tVar) {
            super(0);
            this.f11027b = mVar;
            this.f11028c = aVar;
            this.f11029d = lVar;
            this.f11030e = tVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            this.f11027b.x(this.f11028c, this.f11029d, this.f11030e);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c extends fr.w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f11031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f11032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.p<p076m2.r, Integer, i0> f11033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f11034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f11035f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(er.a<i0> aVar, l lVar, er.p<? super p076m2.r, ? super Integer, i0> pVar, int i15, int i16) {
            super(2);
            this.f11031b = aVar;
            this.f11032c = lVar;
            this.f11033d = pVar;
            this.f11034e = i15;
            this.f11035f = i16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            a.a(this.f11031b, this.f11032c, this.f11033d, rVar, g4.a(this.f11034e | 1), this.f11035f);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends fr.w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f6<er.p<p076m2.r, Integer, i0>> f11036b;

        /* JADX INFO: renamed from: androidx.compose.ui.window.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln4/i0;", "Loq/i0;", "c", "(Ln4/i0;)V"}, k = 3, mv = {2, 1, 0})
        static final class C0242a extends fr.w implements er.l<n4.i0, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0242a f11037b = new C0242a();

            C0242a() {
                super(1);
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
                c(i0Var);
                return i0.f148189a;
            }

            public final void c(n4.i0 i0Var) {
                f0.i(i0Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(f6<? extends er.p<? super p076m2.r, ? super Integer, i0>> f6Var) {
            super(2);
            this.f11036b = f6Var;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            if (!rVar.r((i15 & 3) != 2, i15 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1338939603, i15, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:265)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = C0242a.f11037b;
                rVar.v(objE);
            }
            a.c(n4.v.d(companion, false, (er.l) objE, 1, null), a.b(this.f11036b), rVar, 0, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "c", "()Ljava/util/UUID;"}, k = 3, mv = {2, 1, 0})
    static final class e extends fr.w implements er.a<UUID> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f11038b = new e();

        e() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final UUID a() {
            return UUID.randomUUID();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;"}, k = 3, mv = {2, 1, 0})
    static final class f implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f11039a = new f();

        /* JADX INFO: renamed from: androidx.compose.ui.window.a$f$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
        static final class C0243a extends fr.w implements er.l<a2.a, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<a2> f11040b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0243a(List<? extends a2> list) {
                super(1);
                this.f11040b = list;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
                c(aVar);
                return i0.f148189a;
            }

            public final void c(a2.a aVar) {
                List<a2> list = this.f11040b;
                int size = list.size();
                for (int i15 = 0; i15 < size; i15++) {
                    a2.a.I(aVar, list.get(i15), 0, 0, 0.0f, 4, null);
                }
            }
        }

        f() {
        }

        @Override // p036e4.w0
        public final x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int iN = 0;
            int iM = 0;
            for (int i15 = 0; i15 < size; i15++) {
                a2 a2VarO0 = list.get(i15).o0(j15);
                iN = Math.max(iN, a2VarO0.getWidth());
                iM = Math.max(iM, a2VarO0.getHeight());
                arrayList.add(a2VarO0);
            }
            if (list.isEmpty()) {
                iN = c5.b.n(j15);
                iM = c5.b.m(j15);
            }
            return y0.j2(y0Var, iN, iM, null, new C0243a(arrayList), 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g extends fr.w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f3.m f11041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.p<p076m2.r, Integer, i0> f11042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f11043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f11044e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(f3.m mVar, er.p<? super p076m2.r, ? super Integer, i0> pVar, int i15, int i16) {
            super(2);
            this.f11041b = mVar;
            this.f11042c = pVar;
            this.f11043d = i15;
            this.f11044e = i16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            a.c(this.f11041b, this.f11042c, rVar, g4.a(this.f11043d | 1), this.f11044e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:52:0x011c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0132  */
    /* JADX WARN: Code duplicated, block: B:56:0x0134  */
    /* JADX WARN: Code duplicated, block: B:60:0x013d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0154  */
    /* JADX WARN: Code duplicated, block: B:68:0x0167  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0175  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void a(er.a<i0> aVar, l lVar, er.p<? super p076m2.r, ? super Integer, i0> pVar, p076m2.r rVar, int i15, int i16) {
        int i17;
        l lVar2;
        int i18;
        boolean z15;
        l lVar3;
        d5 d5VarM;
        View view;
        c5.d dVar;
        c5.t tVar;
        p076m2.v vVarE;
        f6 f6VarP;
        Object objE;
        p076m2.r.Companion companion;
        UUID uuid;
        boolean zW;
        Object objE2;
        m mVar;
        boolean zG;
        Object objE3;
        boolean z16;
        boolean zC;
        Object objE4;
        int i19;
        p076m2.r rVarH = rVar.h(826668973);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i25 = i16 & 2;
        if (i25 == 0) {
            if ((i15 & 48) == 0) {
                lVar2 = lVar;
                i17 |= rVarH.W(lVar2) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.G(pVar)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i18 = i17;
            if ((i18 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                if (i25 != 0) {
                    lVar3 = new l(false, false, false, 7, null);
                } else {
                    lVar3 = lVar2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(826668973, i18, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:249)");
                }
                view = (View) rVarH.N(AndroidCompositionLocals_androidKt.g());
                dVar = (c5.d) rVarH.N(g1.f());
                tVar = (c5.t) rVarH.N(g1.l());
                vVarE = p076m2.m.e(rVarH, 0);
                f6VarP = x5.p(pVar, rVarH, (i18 >> 6) & 14);
                Object[] objArr = new Object[0];
                objE = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE == companion.a()) {
                    objE = e.f11038b;
                    rVarH.v(objE);
                }
                uuid = (UUID) b3.f.k(objArr, (er.a) objE, rVarH, 48);
                zW = rVarH.W(view) | rVarH.W(dVar) | rVarH.c(lVar3.getWindowType()) | rVarH.W(lVar3.getWindowToken());
                objE2 = rVarH.E();
                if (zW || objE2 == companion.a()) {
                    m mVar2 = new m(aVar, lVar3, view, tVar, dVar, uuid);
                    mVar2.u(vVarE, y2.m.b(-1338939603, true, new d(f6VarP)));
                    rVarH.v(mVar2);
                    objE2 = mVar2;
                }
                mVar = (m) objE2;
                zG = rVarH.G(mVar);
                objE3 = rVarH.E();
                if (zG || objE3 == companion.a()) {
                    objE3 = new C0240a(mVar);
                    rVarH.v(objE3);
                }
                Function0.a(mVar, (er.l) objE3, rVarH, 0);
                boolean zG2 = rVarH.G(mVar);
                if ((i18 & 14) == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zC = zG2 | z16 | ((i18 & 112) == 32) | rVarH.c(tVar.ordinal());
                objE4 = rVarH.E();
                if (zC || objE4 == companion.a()) {
                    objE4 = new b(mVar, aVar, lVar3, tVar);
                    rVarH.v(objE4);
                }
                Function0.g((er.a) objE4, rVarH, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
                lVar3 = lVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new c(aVar, lVar3, pVar, i15, i16));
            }
        }
        i17 |= 48;
        lVar2 = lVar;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if (rVarH.G(pVar)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i17 |= i19;
        }
        i18 = i17;
        if ((i18 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i18 & 1)) {
            if (i25 != 0) {
                lVar3 = new l(false, false, false, 7, null);
            } else {
                lVar3 = lVar2;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(826668973, i18, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:249)");
            }
            view = (View) rVarH.N(AndroidCompositionLocals_androidKt.g());
            dVar = (c5.d) rVarH.N(g1.f());
            tVar = (c5.t) rVarH.N(g1.l());
            vVarE = p076m2.m.e(rVarH, 0);
            f6VarP = x5.p(pVar, rVarH, (i18 >> 6) & 14);
            Object[] objArr2 = new Object[0];
            objE = rVarH.E();
            companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = e.f11038b;
                rVarH.v(objE);
            }
            uuid = (UUID) b3.f.k(objArr2, (er.a) objE, rVarH, 48);
            zW = rVarH.W(view) | rVarH.W(dVar) | rVarH.c(lVar3.getWindowType()) | rVarH.W(lVar3.getWindowToken());
            objE2 = rVarH.E();
            if (zW) {
                m mVar3 = new m(aVar, lVar3, view, tVar, dVar, uuid);
                mVar3.u(vVarE, y2.m.b(-1338939603, true, new d(f6VarP)));
                rVarH.v(mVar3);
                objE2 = mVar3;
            } else {
                m mVar4 = new m(aVar, lVar3, view, tVar, dVar, uuid);
                mVar4.u(vVarE, y2.m.b(-1338939603, true, new d(f6VarP)));
                rVarH.v(mVar4);
                objE2 = mVar4;
            }
            mVar = (m) objE2;
            zG = rVarH.G(mVar);
            objE3 = rVarH.E();
            if (zG) {
                objE3 = new C0240a(mVar);
                rVarH.v(objE3);
            } else {
                objE3 = new C0240a(mVar);
                rVarH.v(objE3);
            }
            Function0.a(mVar, (er.l) objE3, rVarH, 0);
            boolean zG3 = rVarH.G(mVar);
            if ((i18 & 14) == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            zC = zG3 | z16 | ((i18 & 112) == 32) | rVarH.c(tVar.ordinal());
            objE4 = rVarH.E();
            if (zC) {
                objE4 = new b(mVar, aVar, lVar3, tVar);
                rVarH.v(objE4);
            } else {
                objE4 = new b(mVar, aVar, lVar3, tVar);
                rVarH.v(objE4);
            }
            Function0.g((er.a) objE4, rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
            lVar3 = lVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new c(aVar, lVar3, pVar, i15, i16));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final er.p<p076m2.r, Integer, i0> b(f6<? extends er.p<? super p076m2.r, ? super Integer, i0>> f6Var) {
        return (er.p) f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(f3.m mVar, er.p<? super p076m2.r, ? super Integer, i0> pVar, p076m2.r rVar, int i15, int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(1090521195);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                mVar = f3.m.INSTANCE;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1090521195, i17, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:752)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = f.f11039a;
                rVarH.v(objE);
            }
            w0 w0Var = (w0) objE;
            int i19 = ((i17 >> 3) & 14) | MLKEMEngine.KyberPolyBytes | ((i17 << 3) & 112);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVar);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            int i25 = ((i19 << 6) & 896) | 6;
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0Var, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            pVar.B(rVarH, Integer.valueOf((i25 >> 6) & 14));
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new g(mVar, pVar, i15, i16));
        }
    }
}
