package b60;

import android.content.res.Configuration;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.a3;
import d1.e0;
import d1.i0;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import d1.t4;
import d1.x;
import er.p;
import h30.ButtonData;
import h30.q;
import j30.ButtonTextData;
import java.util.List;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p076m2.m5;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p076m2.y2;
import pq.v;
import q4.TextStyle;
import w0.i1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000b\u001a)\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a9\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010#\u001a\u00020 *\u00020 2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$\u001a#\u0010'\u001a\u00020 *\u00020 2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020!H\u0002¢\u0006\u0004\b'\u0010(¨\u0006*²\u0006\u000e\u0010)\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lb60/d;", "whatsNewData", "Loq/i0;", "r", "(Lb60/d;Lm2/r;I)V", "", "isLandscape", "Lb60/a;", "colors", "Landroidx/compose/ui/graphics/c;", "z", "(ZLb60/a;)Landroidx/compose/ui/graphics/c;", "y", "", "imageCount", "currentImageIndex", "Lf3/m;", "modifier", "p", "(IILf3/m;Lm2/r;II)V", "Lmx/a;", "title", "description", "j", "(Lmx/a;Lmx/a;Lm2/r;II)V", "Lh30/a;", "primaryAction", "secondaryAction", "Lj30/a;", "textButton", "l", "(Lh30/a;Lf3/m;Lh30/a;Lj30/a;Lm2/r;II)V", "Ll70/c;", "Landroidx/compose/ui/graphics/Color;", "textColor", "B", "(Ll70/c;J)Ll70/c;", "contentColor", "containerColor", "A", "(Ll70/c;JJ)Ll70/c;", "currentIndex", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0003\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"b60/n$a", "Ll70/c;", "Ll70/a;", "b", "Ll70/a;", "c", "()Ll70/a;", "base", "La20/a;", "a", "()La20/a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f37063p, "Ll70/h;", "()Ll70/h;", "support", "Ll70/i;", "getSurface", "()Ll70/i;", "surface", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements l70.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l70.c f16829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final l70.a base;

        /* JADX INFO: renamed from: b60.n$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\r"}, d2 = {"b60/n$a$a", "Ll70/a;", "Landroidx/compose/ui/graphics/Color;", "b", "J", "()J", "secondary", "c", "primary", "d", "onPrimary", "a", "background", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0409a implements l70.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ l70.a f16831a;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final long secondary;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final long primary;

            C0409a(l70.c cVar, long j15, long j16) {
                this.f16831a = cVar.getBase();
                this.secondary = j15;
                this.primary = j16;
            }

            @Override // l70.a
            public long a() {
                return this.f16831a.a();
            }

            @Override // l70.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public long getSecondary() {
                return this.secondary;
            }

            @Override // l70.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public long getPrimary() {
                return this.primary;
            }

            @Override // l70.a
            public long d() {
                return this.f16831a.d();
            }
        }

        a(l70.c cVar, long j15, long j16) {
            this.f16829a = cVar;
            this.base = new C0409a(cVar, j15, j16);
        }

        @Override // l70.c
        /* JADX INFO: renamed from: a */
        public a20.a getNeutral() {
            return this.f16829a.getNeutral();
        }

        @Override // l70.c
        /* JADX INFO: renamed from: b */
        public l70.h getSupport() {
            return this.f16829a.getSupport();
        }

        @Override // l70.c
        /* JADX INFO: renamed from: c, reason: from getter */
        public l70.a getBase() {
            return this.base;
        }

        @Override // l70.c
        public l70.i getSurface() {
            return this.f16829a.getSurface();
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0003\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"b60/n$b", "Ll70/c;", "Ll70/a;", "b", "Ll70/a;", "c", "()Ll70/a;", "base", "La20/a;", "a", "()La20/a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f37063p, "Ll70/h;", "()Ll70/h;", "support", "Ll70/i;", "getSurface", "()Ll70/i;", "surface", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements l70.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l70.c f16834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final l70.a base;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006¨\u0006\r"}, d2 = {"b60/n$b$a", "Ll70/a;", "Landroidx/compose/ui/graphics/Color;", "b", "J", "c", "()J", "primary", "d", "onPrimary", "secondary", "a", "background", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements l70.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ l70.a f16836a;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final long primary;

            a(l70.c cVar, long j15) {
                this.f16836a = cVar.getBase();
                this.primary = j15;
            }

            @Override // l70.a
            public long a() {
                return this.f16836a.a();
            }

            @Override // l70.a
            /* JADX INFO: renamed from: b */
            public long getSecondary() {
                return this.f16836a.getSecondary();
            }

            @Override // l70.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public long getPrimary() {
                return this.primary;
            }

            @Override // l70.a
            public long d() {
                return this.f16836a.d();
            }
        }

        b(l70.c cVar, long j15) {
            this.f16834a = cVar;
            this.base = new a(cVar, j15);
        }

        @Override // l70.c
        /* JADX INFO: renamed from: a */
        public a20.a getNeutral() {
            return this.f16834a.getNeutral();
        }

        @Override // l70.c
        /* JADX INFO: renamed from: b */
        public l70.h getSupport() {
            return this.f16834a.getSupport();
        }

        @Override // l70.c
        /* JADX INFO: renamed from: c, reason: from getter */
        public l70.a getBase() {
            return this.base;
        }

        @Override // l70.c
        public l70.i getSurface() {
            return this.f16834a.getSurface();
        }
    }

    private static final l70.c A(l70.c cVar, long j15, long j16) {
        return new a(cVar, j16, j15);
    }

    private static final l70.c B(l70.c cVar, long j15) {
        return new b(cVar, j15);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x0156  */
    /* JADX WARN: Code duplicated, block: B:44:0x0164  */
    /* JADX WARN: Code duplicated, block: B:47:0x01be  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    private static final void j(Label label, Label label2, r rVar, final int i15, final int i16) {
        int i17;
        Label label3;
        boolean z15;
        r rVar2;
        final Label label4;
        final Label label5;
        d5 d5VarM;
        Label label6;
        k70.a aVar;
        int i18;
        er.a<androidx.compose.ui.node.c> aVarB;
        Color.Companion companion;
        r rVarH = rVar.h(2048290818);
        if ((i15 & 6) == 0) {
            i17 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i17 = i15;
        }
        int i19 = i16 & 2;
        if (i19 == 0) {
            if ((i15 & 48) == 0) {
                label3 = label2;
                i17 |= rVarH.W(label3) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i19 != 0) {
                    label6 = null;
                } else {
                    label6 = label3;
                }
                if (t.k()) {
                    t.o(2048290818, i17, -1, "pl.gov.coi.common.ui.ds.whatsnew.BodySection (WhatsNew.kt:233)");
                }
                f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
                d1.i iVar = d1.i.f39152a;
                aVar = k70.a.f108864a;
                i18 = k70.a.f108865b;
                w0 w0VarA = e0.a(iVar.r(aVar.b(rVarH, i18).getSpacing100()), f3.c.INSTANCE.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVarH);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion2.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarA, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                i0 i0Var = i0.f39176a;
                TextStyle textStyleG = aVar.f(rVarH, i18).g();
                companion = Color.INSTANCE;
                j70.h.g(null, null, label, null, null, companion.i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleG, null, null, false, false, null, rVarH, ((i17 << 6) & 896) | 196608, 0, 0, 33030107);
                label4 = label;
                if (label6 == null) {
                    rVarH.X(-1073468176);
                    rVarH.R();
                    rVar2 = rVarH;
                    label5 = label6;
                } else {
                    rVarH.X(-1073468175);
                    label5 = label6;
                    j70.h.g(null, null, label5, null, null, companion.i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).d(), null, null, false, false, null, rVarH, 196608, 0, 0, 33030107);
                    rVar2 = rVarH;
                    rVar2.R();
                }
                rVar2.x();
                if (t.k()) {
                    t.n();
                }
            } else {
                rVar2 = rVarH;
                label4 = label;
                rVar2.O();
                label5 = label3;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: b60.i
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n.k(label4, label5, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        label3 = label2;
        if ((i17 & 19) != 18) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i19 != 0) {
                label6 = null;
            } else {
                label6 = label3;
            }
            if (t.k()) {
                t.o(2048290818, i17, -1, "pl.gov.coi.common.ui.ds.whatsnew.BodySection (WhatsNew.kt:233)");
            }
            f3.m mVarH2 = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
            d1.i iVar2 = d1.i.f39152a;
            aVar = k70.a.f108864a;
            i18 = k70.a.f108865b;
            w0 w0VarA2 = e0.a(iVar2.r(aVar.b(rVarH, i18).getSpacing100()), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarH2);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            i0 i0Var2 = i0.f39176a;
            TextStyle textStyleG2 = aVar.f(rVarH, i18).g();
            companion = Color.INSTANCE;
            j70.h.g(null, null, label, null, null, companion.i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleG2, null, null, false, false, null, rVarH, ((i17 << 6) & 896) | 196608, 0, 0, 33030107);
            label4 = label;
            if (label6 == null) {
                rVarH.X(-1073468176);
                rVarH.R();
                rVar2 = rVarH;
                label5 = label6;
            } else {
                rVarH.X(-1073468175);
                label5 = label6;
                j70.h.g(null, null, label5, null, null, companion.i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).d(), null, null, false, false, null, rVarH, 196608, 0, 0, 33030107);
                rVar2 = rVarH;
                rVar2.R();
            }
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            label4 = label;
            rVar2.O();
            label5 = label3;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: b60.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.k(label4, label5, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(Label label, Label label2, int i15, int i16, r rVar, int i17) {
        j(label, label2, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0094  */
    /* JADX WARN: Code duplicated, block: B:61:0x009b  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:71:0x012d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0137  */
    /* JADX WARN: Code duplicated, block: B:76:0x017a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0188  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    private static final void l(final ButtonData buttonData, f3.m mVar, ButtonData buttonData2, ButtonTextData buttonTextData, r rVar, final int i15, final int i16) {
        int i17;
        f3.m mVar2;
        int i18;
        ButtonData buttonData3;
        int i19;
        int i25;
        boolean zG;
        int i26;
        boolean z15;
        final f3.m mVar3;
        final ButtonData buttonData4;
        final ButtonTextData buttonTextData2;
        d5 d5VarM;
        f3.m mVar4;
        k70.a aVar;
        int i27;
        l70.c cVarA;
        er.a<androidx.compose.ui.node.c> aVarB;
        f3.m.Companion companion;
        ButtonData buttonData5;
        int i28;
        final ButtonTextData buttonTextData3 = buttonTextData;
        r rVarH = rVar.h(-312006035);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(buttonData) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i29 = i16 & 2;
        if (i29 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    buttonData3 = buttonData2;
                    if (rVarH.W(buttonData3)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 8;
                if (i25 != 0) {
                    i17 |= 3072;
                } else if ((i15 & 3072) == 0) {
                    if ((i15 & PKIFailureInfo.certConfirmed) == 0) {
                        zG = rVarH.W(buttonTextData3);
                    } else {
                        zG = rVarH.G(buttonTextData3);
                    }
                    if (zG) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                if ((i17 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i29 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        buttonData3 = null;
                    }
                    if (i25 != 0) {
                        buttonTextData3 = null;
                    }
                    if (t.k()) {
                        t.o(-312006035, i17, -1, "pl.gov.coi.common.ui.ds.whatsnew.BottomActionContainer (WhatsNew.kt:259)");
                    }
                    aVar = k70.a.f108864a;
                    i27 = k70.a.f108865b;
                    cVarA = aVar.a(rVarH, i27);
                    WhatsNewColorScheme whatsNewColorScheme = (WhatsNewColorScheme) rVarH.N(c.d());
                    f3.c.InterfaceC1317c interfaceC1317cI = f3.c.INSTANCE.i();
                    f3.m mVarH = androidx.compose.foundation.layout.d.h(mVar4, 0.0f, 1, null);
                    w0 w0VarB = m3.b(d1.i.f39152a.j(), interfaceC1317cI, rVarH, 48);
                    int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT = rVarH.t();
                    f3.m mVarE = f3.j.e(rVarH, mVarH);
                    androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion2.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    r rVarC = n6.c(rVarH);
                    n6.i(rVarC, w0VarB, companion2.d());
                    n6.i(rVarC, e0VarT, companion2.f());
                    n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                    n6.g(rVarC, companion2.a());
                    n6.i(rVarC, mVarE, companion2.e());
                    q3 q3Var = q3.f39261a;
                    if (buttonTextData3 == null) {
                        rVarH.X(-1514372710);
                    } else {
                        rVarH.X(-1514372709);
                        d0.c(l70.e.c().d(B(cVarA, Color.INSTANCE.i())), y2.m.d(238609999, true, new p() { // from class: b60.j
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return n.m(buttonTextData3, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, c4.f122821i | 48);
                    }
                    rVarH.R();
                    companion = f3.m.INSTANCE;
                    r3.a(p3.c(q3Var, companion, 1.0f, false, 2, null), rVarH, 0);
                    if (buttonData3 == null) {
                        rVarH.X(-1514121331);
                        rVarH.R();
                        buttonData5 = buttonData3;
                        i28 = 0;
                    } else {
                        rVarH.X(-1514121330);
                        buttonData5 = buttonData3;
                        q.p(buttonData5, false, null, rVarH, 0, 6);
                        i28 = 0;
                        r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i27).getSpacing100()), rVarH, 0);
                        rVarH.R();
                    }
                    d0.c(l70.e.c().d(A(cVarA, whatsNewColorScheme.e().B(rVarH, Integer.valueOf(i28)).m20unboximpl(), Color.INSTANCE.i())), y2.m.d(-2062969399, true, new p() { // from class: b60.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return n.n(buttonData, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, c4.f122821i | 48);
                    rVarH.x();
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar4;
                    buttonData4 = buttonData5;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    buttonData4 = buttonData3;
                }
                buttonTextData2 = buttonTextData3;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: b60.l
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return n.o(buttonData, mVar3, buttonData4, buttonTextData2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            buttonData3 = buttonData2;
            i25 = i16 & 8;
            if (i25 != 0) {
                i17 |= 3072;
            } else if ((i15 & 3072) == 0) {
                if ((i15 & PKIFailureInfo.certConfirmed) == 0) {
                    zG = rVarH.W(buttonTextData3);
                } else {
                    zG = rVarH.G(buttonTextData3);
                }
                if (zG) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i17 |= i26;
            }
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i29 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    buttonData3 = null;
                }
                if (i25 != 0) {
                    buttonTextData3 = null;
                }
                if (t.k()) {
                    t.o(-312006035, i17, -1, "pl.gov.coi.common.ui.ds.whatsnew.BottomActionContainer (WhatsNew.kt:259)");
                }
                aVar = k70.a.f108864a;
                i27 = k70.a.f108865b;
                cVarA = aVar.a(rVarH, i27);
                WhatsNewColorScheme whatsNewColorScheme2 = (WhatsNewColorScheme) rVarH.N(c.d());
                f3.c.InterfaceC1317c interfaceC1317cI2 = f3.c.INSTANCE.i();
                f3.m mVarH2 = androidx.compose.foundation.layout.d.h(mVar4, 0.0f, 1, null);
                w0 w0VarB2 = m3.b(d1.i.f39152a.j(), interfaceC1317cI2, rVarH, 48);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, mVarH2);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion3.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarB2, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                q3 q3Var2 = q3.f39261a;
                if (buttonTextData3 == null) {
                    rVarH.X(-1514372710);
                } else {
                    rVarH.X(-1514372709);
                    d0.c(l70.e.c().d(B(cVarA, Color.INSTANCE.i())), y2.m.d(238609999, true, new p() { // from class: b60.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return n.m(buttonTextData3, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, c4.f122821i | 48);
                }
                rVarH.R();
                companion = f3.m.INSTANCE;
                r3.a(p3.c(q3Var2, companion, 1.0f, false, 2, null), rVarH, 0);
                if (buttonData3 == null) {
                    rVarH.X(-1514121331);
                    rVarH.R();
                    buttonData5 = buttonData3;
                    i28 = 0;
                } else {
                    rVarH.X(-1514121330);
                    buttonData5 = buttonData3;
                    q.p(buttonData5, false, null, rVarH, 0, 6);
                    i28 = 0;
                    r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i27).getSpacing100()), rVarH, 0);
                    rVarH.R();
                }
                d0.c(l70.e.c().d(A(cVarA, whatsNewColorScheme2.e().B(rVarH, Integer.valueOf(i28)).m20unboximpl(), Color.INSTANCE.i())), y2.m.d(-2062969399, true, new p() { // from class: b60.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n.n(buttonData, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, c4.f122821i | 48);
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar4;
                buttonData4 = buttonData5;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                buttonData4 = buttonData3;
            }
            buttonTextData2 = buttonTextData3;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: b60.l
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n.o(buttonData, mVar3, buttonData4, buttonTextData2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                buttonData3 = buttonData2;
                if (rVarH.W(buttonData3)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i25 = i16 & 8;
            if (i25 != 0) {
                i17 |= 3072;
            } else if ((i15 & 3072) == 0) {
                if ((i15 & PKIFailureInfo.certConfirmed) == 0) {
                    zG = rVarH.W(buttonTextData3);
                } else {
                    zG = rVarH.G(buttonTextData3);
                }
                if (zG) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i17 |= i26;
            }
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i29 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    buttonData3 = null;
                }
                if (i25 != 0) {
                    buttonTextData3 = null;
                }
                if (t.k()) {
                    t.o(-312006035, i17, -1, "pl.gov.coi.common.ui.ds.whatsnew.BottomActionContainer (WhatsNew.kt:259)");
                }
                aVar = k70.a.f108864a;
                i27 = k70.a.f108865b;
                cVarA = aVar.a(rVarH, i27);
                WhatsNewColorScheme whatsNewColorScheme3 = (WhatsNewColorScheme) rVarH.N(c.d());
                f3.c.InterfaceC1317c interfaceC1317cI3 = f3.c.INSTANCE.i();
                f3.m mVarH3 = androidx.compose.foundation.layout.d.h(mVar4, 0.0f, 1, null);
                w0 w0VarB3 = m3.b(d1.i.f39152a.j(), interfaceC1317cI3, rVarH, 48);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT3 = rVarH.t();
                f3.m mVarE3 = f3.j.e(rVarH, mVarH3);
                androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion4.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC3 = n6.c(rVarH);
                n6.i(rVarC3, w0VarB3, companion4.d());
                n6.i(rVarC3, e0VarT3, companion4.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                n6.g(rVarC3, companion4.a());
                n6.i(rVarC3, mVarE3, companion4.e());
                q3 q3Var3 = q3.f39261a;
                if (buttonTextData3 == null) {
                    rVarH.X(-1514372710);
                } else {
                    rVarH.X(-1514372709);
                    d0.c(l70.e.c().d(B(cVarA, Color.INSTANCE.i())), y2.m.d(238609999, true, new p() { // from class: b60.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return n.m(buttonTextData3, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, c4.f122821i | 48);
                }
                rVarH.R();
                companion = f3.m.INSTANCE;
                r3.a(p3.c(q3Var3, companion, 1.0f, false, 2, null), rVarH, 0);
                if (buttonData3 == null) {
                    rVarH.X(-1514121331);
                    rVarH.R();
                    buttonData5 = buttonData3;
                    i28 = 0;
                } else {
                    rVarH.X(-1514121330);
                    buttonData5 = buttonData3;
                    q.p(buttonData5, false, null, rVarH, 0, 6);
                    i28 = 0;
                    r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i27).getSpacing100()), rVarH, 0);
                    rVarH.R();
                }
                d0.c(l70.e.c().d(A(cVarA, whatsNewColorScheme3.e().B(rVarH, Integer.valueOf(i28)).m20unboximpl(), Color.INSTANCE.i())), y2.m.d(-2062969399, true, new p() { // from class: b60.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n.n(buttonData, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, c4.f122821i | 48);
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar4;
                buttonData4 = buttonData5;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                buttonData4 = buttonData3;
            }
            buttonTextData2 = buttonTextData3;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: b60.l
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n.o(buttonData, mVar3, buttonData4, buttonTextData2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        buttonData3 = buttonData2;
        i25 = i16 & 8;
        if (i25 != 0) {
            i17 |= 3072;
        } else if ((i15 & 3072) == 0) {
            if ((i15 & PKIFailureInfo.certConfirmed) == 0) {
                zG = rVarH.W(buttonTextData3);
            } else {
                zG = rVarH.G(buttonTextData3);
            }
            if (zG) {
                i26 = 2048;
            } else {
                i26 = 1024;
            }
            i17 |= i26;
        }
        if ((i17 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i29 != 0) {
                mVar4 = f3.m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (i18 != 0) {
                buttonData3 = null;
            }
            if (i25 != 0) {
                buttonTextData3 = null;
            }
            if (t.k()) {
                t.o(-312006035, i17, -1, "pl.gov.coi.common.ui.ds.whatsnew.BottomActionContainer (WhatsNew.kt:259)");
            }
            aVar = k70.a.f108864a;
            i27 = k70.a.f108865b;
            cVarA = aVar.a(rVarH, i27);
            WhatsNewColorScheme whatsNewColorScheme4 = (WhatsNewColorScheme) rVarH.N(c.d());
            f3.c.InterfaceC1317c interfaceC1317cI4 = f3.c.INSTANCE.i();
            f3.m mVarH4 = androidx.compose.foundation.layout.d.h(mVar4, 0.0f, 1, null);
            w0 w0VarB4 = m3.b(d1.i.f39152a.j(), interfaceC1317cI4, rVarH, 48);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT4 = rVarH.t();
            f3.m mVarE4 = f3.j.e(rVarH, mVarH4);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion5.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarB4, companion5.d());
            n6.i(rVarC4, e0VarT4, companion5.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion5.c());
            n6.g(rVarC4, companion5.a());
            n6.i(rVarC4, mVarE4, companion5.e());
            q3 q3Var4 = q3.f39261a;
            if (buttonTextData3 == null) {
                rVarH.X(-1514372710);
            } else {
                rVarH.X(-1514372709);
                d0.c(l70.e.c().d(B(cVarA, Color.INSTANCE.i())), y2.m.d(238609999, true, new p() { // from class: b60.j
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n.m(buttonTextData3, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, c4.f122821i | 48);
            }
            rVarH.R();
            companion = f3.m.INSTANCE;
            r3.a(p3.c(q3Var4, companion, 1.0f, false, 2, null), rVarH, 0);
            if (buttonData3 == null) {
                rVarH.X(-1514121331);
                rVarH.R();
                buttonData5 = buttonData3;
                i28 = 0;
            } else {
                rVarH.X(-1514121330);
                buttonData5 = buttonData3;
                q.p(buttonData5, false, null, rVarH, 0, 6);
                i28 = 0;
                r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i27).getSpacing100()), rVarH, 0);
                rVarH.R();
            }
            d0.c(l70.e.c().d(A(cVarA, whatsNewColorScheme4.e().B(rVarH, Integer.valueOf(i28)).m20unboximpl(), Color.INSTANCE.i())), y2.m.d(-2062969399, true, new p() { // from class: b60.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.n(buttonData, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar4;
            buttonData4 = buttonData5;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            buttonData4 = buttonData3;
        }
        buttonTextData2 = buttonTextData3;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: b60.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.o(buttonData, mVar3, buttonData4, buttonTextData2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(ButtonTextData buttonTextData, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(238609999, i15, -1, "pl.gov.coi.common.ui.ds.whatsnew.BottomActionContainer.<anonymous>.<anonymous>.<anonymous> (WhatsNew.kt:270)");
            }
            j30.f.e(null, buttonTextData, false, rVar, 0, 5);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(ButtonData buttonData, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-2062969399, i15, -1, "pl.gov.coi.common.ui.ds.whatsnew.BottomActionContainer.<anonymous>.<anonymous> (WhatsNew.kt:285)");
            }
            q.p(buttonData, false, null, rVar, 0, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(ButtonData buttonData, f3.m mVar, ButtonData buttonData2, ButtonTextData buttonTextData, int i15, int i16, r rVar, int i17) {
        l(buttonData, mVar, buttonData2, buttonTextData, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x0125  */
    /* JADX WARN: Code duplicated, block: B:52:0x0131  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Code duplicated, block: B:56:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0170  */
    /* JADX WARN: Code duplicated, block: B:58:0x0175  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    private static final void p(final int i15, final int i16, f3.m mVar, r rVar, final int i17, final int i18) {
        f3.m mVar2;
        boolean z15;
        f3.m mVar3;
        d5 d5VarM;
        WhatsNewColorScheme whatsNewColorScheme;
        er.a<androidx.compose.ui.node.c> aVarB;
        er.a<androidx.compose.ui.node.c> aVarB2;
        q3 q3Var;
        int i19;
        long progressInactive;
        r rVarH = rVar.h(138739130);
        int i25 = (i17 & 6) == 0 ? (rVarH.c(i15) ? 4 : 2) | i17 : i17;
        if ((i17 & 48) == 0) {
            i25 |= rVarH.c(i16) ? 32 : 16;
        }
        int i26 = i18 & 4;
        if (i26 == 0) {
            if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i25 |= rVarH.W(mVar2) ? 256 : 128;
            }
            if ((i25 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i25 & 1)) {
                if (i26 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (t.k()) {
                    t.o(138739130, i25, -1, "pl.gov.coi.common.ui.ds.whatsnew.ProgressArea (WhatsNew.kt:203)");
                }
                whatsNewColorScheme = (WhatsNewColorScheme) rVarH.N(c.d());
                f3.m mVarH = androidx.compose.foundation.layout.d.h(mVar3, 0.0f, 1, null);
                d1.i iVar = d1.i.f39152a;
                d1.i.n nVarK = iVar.k();
                f3.c.Companion companion = f3.c.INSTANCE;
                w0 w0VarA = e0.a(nVarK, companion.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVarH);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion2.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarA, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                i0 i0Var = i0.f39176a;
                d1.i.f fVarR = iVar.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200());
                f3.m mVarH2 = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
                w0 w0VarB = m3.b(fVarR, companion.l(), rVarH, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, mVarH2);
                aVarB2 = companion2.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarB, companion2.d());
                n6.i(rVarC2, e0VarT2, companion2.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
                n6.g(rVarC2, companion2.a());
                n6.i(rVarC2, mVarE2, companion2.e());
                q3Var = q3.f39261a;
                rVarH.X(-1733006837);
                for (i19 = 0; i19 < i15; i19++) {
                    if (i19 == i16) {
                        progressInactive = whatsNewColorScheme.getProgressActive();
                    } else {
                        progressInactive = whatsNewColorScheme.getProgressInactive();
                    }
                    d1.r.b(w0.i.d(k3.f.a(androidx.compose.foundation.layout.d.i(p3.c(q3Var, f3.m.INSTANCE, 1.0f, false, 2, null), c5.h.n(3)), l1.h.b(100)), progressInactive, null, 2, null), rVarH, 0);
                }
                rVarH.R();
                rVarH.x();
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
            } else {
                rVarH.O();
                mVar3 = mVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final f3.m mVar4 = mVar3;
                d5VarM.a(new p() { // from class: b60.m
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n.q(i15, i16, mVar4, i17, i18, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i25 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        if ((i25 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i25 & 1)) {
            if (i26 != 0) {
                mVar3 = f3.m.INSTANCE;
            } else {
                mVar3 = mVar2;
            }
            if (t.k()) {
                t.o(138739130, i25, -1, "pl.gov.coi.common.ui.ds.whatsnew.ProgressArea (WhatsNew.kt:203)");
            }
            whatsNewColorScheme = (WhatsNewColorScheme) rVarH.N(c.d());
            f3.m mVarH3 = androidx.compose.foundation.layout.d.h(mVar3, 0.0f, 1, null);
            d1.i iVar2 = d1.i.f39152a;
            d1.i.n nVarK2 = iVar2.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA2 = e0.a(nVarK2, companion3.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarH3);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarA2, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            i0 i0Var2 = i0.f39176a;
            d1.i.f fVarR2 = iVar2.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200());
            f3.m mVarH4 = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
            w0 w0VarB2 = m3.b(fVarR2, companion3.l(), rVarH, 0);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT4 = rVarH.t();
            f3.m mVarE4 = f3.j.e(rVarH, mVarH4);
            aVarB2 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarB2, companion4.d());
            n6.i(rVarC4, e0VarT4, companion4.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion4.c());
            n6.g(rVarC4, companion4.a());
            n6.i(rVarC4, mVarE4, companion4.e());
            q3Var = q3.f39261a;
            rVarH.X(-1733006837);
            while (i19 < i15) {
                if (i19 == i16) {
                    progressInactive = whatsNewColorScheme.getProgressActive();
                } else {
                    progressInactive = whatsNewColorScheme.getProgressInactive();
                }
                d1.r.b(w0.i.d(k3.f.a(androidx.compose.foundation.layout.d.i(p3.c(q3Var, f3.m.INSTANCE, 1.0f, false, 2, null), c5.h.n(3)), l1.h.b(100)), progressInactive, null, 2, null), rVarH, 0);
            }
            rVarH.R();
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final f3.m mVar5 = mVar3;
            d5VarM.a(new p() { // from class: b60.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.q(i15, i16, mVar5, i17, i18, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(int i15, int i16, f3.m mVar, int i17, int i18, r rVar, int i19) {
        p(i15, i16, mVar, rVar, g4.a(i17 | 1), i18);
        return oq.i0.f148189a;
    }

    public static final void r(final WhatsNewData whatsNewData, r rVar, final int i15) {
        int i16;
        r rVar2;
        ButtonData buttonDataB;
        ButtonData buttonData;
        ButtonData buttonDataB2;
        r rVarH = rVar.h(-2027034969);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(whatsNewData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-2027034969, i16, -1, "pl.gov.coi.common.ui.ds.whatsnew.WhatsNew (WhatsNew.kt:50)");
            }
            WhatsNewColorScheme whatsNewColorScheme = (WhatsNewColorScheme) rVarH.N(c.d());
            boolean z15 = ((Configuration) rVarH.N(AndroidCompositionLocals_androidKt.b())).orientation == 2;
            final List<WhatsNewSlideData> listE = whatsNewData.e();
            Object[] objArr = {listE};
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = new er.a() { // from class: b60.e
                    @Override // er.a
                    public final Object a() {
                        return n.s();
                    }
                };
                rVarH.v(objE);
            }
            final y2 y2Var = (y2) b3.f.k(objArr, (er.a) objE, rVarH, 48);
            final int iN = lr.m.n(t(y2Var), 0, lr.m.e(listE.size() - 1, 0));
            WhatsNewSlideData whatsNewSlideData = (WhatsNewSlideData) v.o0(listE, iN);
            boolean z16 = iN == 0;
            boolean z17 = listE.isEmpty() || iN == v.p(listE);
            if (z17) {
                rVarH.X(-157996328);
                rVarH.R();
                buttonDataB = whatsNewData.getFinishAction();
            } else {
                rVarH.X(-157952587);
                ButtonData navigationAction = whatsNewData.getNavigationAction();
                boolean zW = rVarH.W(y2Var) | rVarH.c(iN) | rVarH.G(listE);
                Object objE2 = rVarH.E();
                if (zW || objE2 == companion.a()) {
                    objE2 = new er.a() { // from class: b60.f
                        @Override // er.a
                        public final Object a() {
                            return n.v(iN, listE, y2Var);
                        }
                    };
                    rVarH.v(objE2);
                }
                buttonDataB = ButtonData.b(navigationAction, null, null, null, null, null, null, (er.a) objE2, 63, null);
                rVarH.R();
            }
            ButtonData buttonData2 = buttonDataB;
            if (z16) {
                rVarH.X(-157660691);
                rVarH.R();
                buttonData = null;
            } else {
                rVarH.X(-157747925);
                ButtonData previousAction = whatsNewData.getPreviousAction();
                if (previousAction == null) {
                    rVarH.X(-157747926);
                    rVarH.R();
                    buttonDataB2 = null;
                } else {
                    rVarH.X(1934574007);
                    boolean zW2 = rVarH.W(y2Var) | rVarH.c(iN);
                    Object objE3 = rVarH.E();
                    if (zW2 || objE3 == companion.a()) {
                        objE3 = new er.a() { // from class: b60.g
                            @Override // er.a
                            public final Object a() {
                                return n.w(iN, y2Var);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    buttonDataB2 = ButtonData.b(previousAction, null, null, null, null, null, null, (er.a) objE3, 63, null);
                    rVarH.R();
                }
                rVarH.R();
                buttonData = buttonDataB2;
            }
            ButtonTextData skipAction = !z17 ? whatsNewData.getSkipAction() : null;
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarD = w0.i.d(androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null), whatsNewColorScheme.getContainer(), null, 2, null);
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            x xVar = x.f39368a;
            boolean z18 = z15;
            coil3.compose.d.a(whatsNewSlideData != null ? whatsNewSlideData.getImageUrl() : null, null, androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null), null, null, companion3.m(), p036e4.l.INSTANCE.a(), 0.0f, null, 0, false, rVarH, 1769904, 0, 1944);
            d1.r.b(w0.i.b(androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null), z(z18, whatsNewColorScheme), null, 0.0f, 6, null), rVarH, 0);
            d1.r.b(w0.i.b(androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null), y(z18, whatsNewColorScheme), null, 0.0f, 6, null), rVarH, 0);
            f3.c.b bVarK = companion3.k();
            f3.m mVarX = t4.x(xVar.d(companion2, companion3.m()));
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(a3.p(a3.r(mVarX, 0.0f, aVar.b(rVarH, i17).getSpacing100(), 0.0f, 0.0f, 13, null), aVar.b(rVarH, i17).getSpacing200(), 0.0f, 2, null), 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = e0.a(iVar.k(), bVarK, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarH);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            i0 i0Var = i0.f39176a;
            p(listE.size(), iN, androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), rVarH, MLKEMEngine.KyberPolyBytes, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i17).getSpacing400()), rVarH, 0);
            i1.c(l4.c.c(a30.a.f2273c, rVarH, 0), null, null, null, null, 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48, 124);
            rVar2 = rVarH;
            rVar2.x();
            if (whatsNewSlideData != null) {
                rVar2.X(-1570474290);
                f3.m mVarD2 = xVar.d(a3.p(companion2, aVar.b(rVar2, i17).getSpacing200(), 0.0f, 2, null), companion3.b());
                w0 w0VarA2 = e0.a(iVar.k(), companion3.k(), rVar2, 0);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
                p076m2.e0 e0VarT3 = rVar2.t();
                f3.m mVarE3 = f3.j.e(rVar2, mVarD2);
                er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB3);
                } else {
                    rVar2.u();
                }
                r rVarC3 = n6.c(rVar2);
                n6.i(rVarC3, w0VarA2, companion4.d());
                n6.i(rVarC3, e0VarT3, companion4.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                n6.g(rVarC3, companion4.a());
                n6.i(rVarC3, mVarE3, companion4.e());
                j(whatsNewSlideData.getTitle(), whatsNewSlideData.getDescription(), rVar2, 0, 0);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVar2, i17).getSpacing600()), rVar2, 0);
                l(buttonData2, a3.r(t4.s(companion2), 0.0f, 0.0f, 0.0f, aVar.b(rVar2, i17).getSpacing300(), 7, null), buttonData, skipAction, rVar2, 0, 0);
                rVar2 = rVar2;
                rVar2.x();
            } else {
                rVar2.X(-1575043039);
            }
            rVar2.R();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: b60.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.x(whatsNewData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y2 s() {
        return m5.a(0);
    }

    private static final int t(y2 y2Var) {
        return y2Var.d();
    }

    private static final void u(y2 y2Var, int i15) {
        y2Var.g(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(int i15, List list, y2 y2Var) {
        u(y2Var, lr.m.j(i15 + 1, v.p(list)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(int i15, y2 y2Var) {
        u(y2Var, lr.m.e(i15 - 1, 0));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(WhatsNewData whatsNewData, int i15, r rVar, int i16) {
        r(whatsNewData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final androidx.compose.ui.graphics.c y(boolean z15, WhatsNewColorScheme whatsNewColorScheme) {
        List listQ = z15 ? v.q(Color.m0boximpl(Color.m9copywmQWz5c$default(whatsNewColorScheme.getOverlay(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m0boximpl(Color.m9copywmQWz5c$default(whatsNewColorScheme.getOverlay(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))) : v.q(Color.m0boximpl(Color.m9copywmQWz5c$default(whatsNewColorScheme.getOverlay(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m0boximpl(Color.m9copywmQWz5c$default(whatsNewColorScheme.getOverlay(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null)));
        return z15 ? androidx.compose.ui.graphics.c.Companion.c(androidx.compose.ui.graphics.c.INSTANCE, listQ, 0.0f, 0.0f, 0, 14, null) : androidx.compose.ui.graphics.c.Companion.h(androidx.compose.ui.graphics.c.INSTANCE, listQ, 0.0f, 0.0f, 0, 14, null);
    }

    private static final androidx.compose.ui.graphics.c z(boolean z15, WhatsNewColorScheme whatsNewColorScheme) {
        List listQ = z15 ? v.q(Color.m0boximpl(whatsNewColorScheme.getContainer()), Color.m0boximpl(Color.m9copywmQWz5c$default(whatsNewColorScheme.getContainer(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null))) : v.q(Color.m0boximpl(Color.m9copywmQWz5c$default(whatsNewColorScheme.getContainer(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m0boximpl(whatsNewColorScheme.getContainer()));
        return z15 ? androidx.compose.ui.graphics.c.Companion.c(androidx.compose.ui.graphics.c.INSTANCE, listQ, 0.0f, 0.0f, 0, 14, null) : androidx.compose.ui.graphics.c.Companion.h(androidx.compose.ui.graphics.c.INSTANCE, listQ, 0.0f, 0.0f, 0, 14, null);
    }
}
