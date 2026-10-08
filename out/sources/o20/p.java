package o20;

import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:+\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u0005\r\u001b\u001c\u001d\u001e\u001f\u000f !\"#$%&'()*+,-./0123456\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0082\u0001*789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`¨\u0006a"}, d2 = {"Lo20/p;", "", "<init>", "()V", "", "d", "()Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "", "f", "()Ler/p;", "staticLayerResId", "e", "dynamicLayerResId", "a", "h", "n", "o", "i", "j", "b", "p0", "m0", "q0", "m", "o0", "p", "q", "k", "z", "u", "n0", "c", "f0", "c0", "v", "l", "x", "y", "d0", "b0", "e0", "h0", "g0", "i0", "l0", "k0", "j0", "s", "t", "r", "w", "a0", "g", "Lo20/p$a;", "Lo20/p$b;", "Lo20/p$c;", "Lo20/p$d;", "Lo20/p$e;", "Lo20/p$g;", "Lo20/p$h;", "Lo20/p$i;", "Lo20/p$j;", "Lo20/p$k;", "Lo20/p$l;", "Lo20/p$m;", "Lo20/p$n;", "Lo20/p$o;", "Lo20/p$p;", "Lo20/p$q;", "Lo20/p$r;", "Lo20/p$s;", "Lo20/p$t;", "Lo20/p$u;", "Lo20/p$v;", "Lo20/p$w;", "Lo20/p$x;", "Lo20/p$y;", "Lo20/p$z;", "Lo20/p$a0;", "Lo20/p$b0;", "Lo20/p$c0;", "Lo20/p$d0;", "Lo20/p$e0;", "Lo20/p$f0;", "Lo20/p$g0;", "Lo20/p$h0;", "Lo20/p$i0;", "Lo20/p$j0;", "Lo20/p$k0;", "Lo20/p$l0;", "Lo20/p$m0;", "Lo20/p$n0;", "Lo20/p$o0;", "Lo20/p$p0;", "Lo20/p$q0;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final oq.k<List<p>> f140789b = oq.l.a(new er.a() { // from class: o20.m
        @Override // er.a
        public final Object a() {
            return p.c();
        }
    });

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$a;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f140790c = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "advocate_card";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.n
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.a.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.o
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.a.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private a() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(2100808409);
            if (p076m2.t.k()) {
                p076m2.t.o(2100808409, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.AdvocateCard.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:121)");
            }
            int i16 = c20.b.f22649b;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(-274813994);
            if (p076m2.t.k()) {
                p076m2.t.o(-274813994, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.AdvocateCard.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:120)");
            }
            int i16 = c20.b.f22645a;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return 1588528547;
        }

        public String toString() {
            return "AdvocateCard";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$a0;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a0 extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f140794c = new a0();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "pensioner_mswia";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.c1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.a0.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140798g = 8;

        private a0() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-119305175);
            if (p076m2.t.k()) {
                p076m2.t.o(-119305175, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.PensionerMswia.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:241)");
            }
            int i16 = c20.b.f22678i0;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a0);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return 1691747126;
        }

        public String toString() {
            return "PensionerMswia";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$b;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f140799c = new b();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "attorney_at_law_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.q
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.b.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.r
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.b.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private b() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-1065511963);
            if (p076m2.t.k()) {
                p076m2.t.o(-1065511963, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.AttorneyAtLaw.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:43)");
            }
            int i16 = c20.b.D0;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(-1695362424);
            if (p076m2.t.k()) {
                p076m2.t.o(-1695362424, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.AttorneyAtLaw.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:42)");
            }
            int i16 = c20.b.C0;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return -947666775;
        }

        public String toString() {
            return "AttorneyAtLaw";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$b0;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b0 extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f140803c = new b0();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "pharmacist_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.d1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.b0.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140807g = 8;

        private b0() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-658723521);
            if (p076m2.t.k()) {
                p076m2.t.o(-658723521, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.Pharmacist.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:180)");
            }
            int i16 = c20.b.f22698n0;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b0);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return 1473925324;
        }

        public String toString() {
            return "Pharmacist";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$c;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f140808c = new c();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "auditor_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.s
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.c.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.t
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.c.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private c() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-1134511694);
            if (p076m2.t.k()) {
                p076m2.t.o(-1134511694, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.Auditor.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:133)");
            }
            int i16 = c20.b.f22696m2;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(1824943765);
            if (p076m2.t.k()) {
                p076m2.t.o(1824943765, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.Auditor.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:132)");
            }
            int i16 = c20.b.f22692l2;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return 927584630;
        }

        public String toString() {
            return "Auditor";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$c0;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c0 extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f140812c = new c0();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "doktorant";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.e1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.c0.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140816g = 8;

        private c0() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-968317590);
            if (p076m2.t.k()) {
                p076m2.t.o(-968317590, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.PhdStudent.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:144)");
            }
            int i16 = c20.b.M0;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c0);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return 883478967;
        }

        public String toString() {
            return "PhdStudent";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$d;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f140817c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "bailiff_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.u
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.d.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140821g = 8;

        private d() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(1636297230);
            if (p076m2.t.k()) {
                p076m2.t.o(1636297230, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.BailiffCard.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:78)");
            }
            int i16 = c20.b.f22661e;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return 953180207;
        }

        public String toString() {
            return "BailiffCard";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$d0;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d0 extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f140822c = new d0();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "physiotherapist_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.f1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.d0.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140826g = 8;

        private d0() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-436088743);
            if (p076m2.t.k()) {
                p076m2.t.o(-436088743, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.Physiotherapist.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:174)");
            }
            int i16 = c20.b.H1;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d0);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return 1523884602;
        }

        public String toString() {
            return "Physiotherapist";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$e;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f140827c = new e();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "civil_engineer_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.v
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.e.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.w
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.e.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private e() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(1664534262);
            if (p076m2.t.k()) {
                p076m2.t.o(1664534262, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.CivilEngineer.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:85)");
            }
            int i16 = c20.b.f22696m2;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(1034683801);
            if (p076m2.t.k()) {
                p076m2.t.o(1034683801, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.CivilEngineer.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:84)");
            }
            int i16 = c20.b.f22692l2;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return 1658835450;
        }

        public String toString() {
            return "CivilEngineer";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$e0;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e0 extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f140831c = new e0();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "shooting_licence_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.g1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.e0.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140835g = 8;

        private e0() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-524767483);
            if (p076m2.t.k()) {
                p076m2.t.o(-524767483, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.ShootingLicence.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:186)");
            }
            int i16 = c20.b.f22679i1;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e0);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return -1990122522;
        }

        public String toString() {
            return "ShootingLicence";
        }
    }

    /* JADX INFO: renamed from: o20.p$f, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lo20/p$f;", "", "<init>", "()V", "", "id", "Lo20/p;", "b", "(Ljava/lang/String;)Lo20/p;", "", "allPresets$delegate", "Loq/k;", "a", "()Ljava/util/List;", "allPresets", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        private final List<p> a() {
            return (List) p.f140789b.getValue();
        }

        public final p b(String id5) {
            Object next;
            Iterator<T> it = a().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fr.t.c(((p) next).getBackgroundId(), id5));
            p pVar = (p) next;
            return pVar == null ? h.f140849c : pVar;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$f0;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f0 extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f140836c = new f0();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "solidarity_card_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.h1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.f0.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140840g = 8;

        private f0() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-1243781187);
            if (p076m2.t.k()) {
                p076m2.t.o(-1243781187, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.SolidarityCard.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:138)");
            }
            int i16 = c20.b.f22652b2;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f0);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return 317410250;
        }

        public String toString() {
            return "SolidarityCard";
        }
    }

    /* JADX INFO: renamed from: o20.p$g, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\n¨\u0006\u001a"}, d2 = {"Lo20/p$g;", "Lo20/p;", "Lkotlin/Function0;", "", "staticLayerResId", "dynamicLayerResId", "<init>", "(Ler/p;Ler/p;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ler/p;", "f", "()Ler/p;", "d", "e", "Ljava/lang/String;", "backgroundId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Custom extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<p076m2.r, Integer, Integer> staticLayerResId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<p076m2.r, Integer, Integer> dynamicLayerResId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String backgroundId;

        /* JADX WARN: Multi-variable type inference failed */
        public Custom(er.p<? super p076m2.r, ? super Integer, Integer> pVar, er.p<? super p076m2.r, ? super Integer, Integer> pVar2) {
            super(null);
            this.staticLayerResId = pVar;
            this.dynamicLayerResId = pVar2;
            this.backgroundId = "CustomId";
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getBackgroundId() {
            return this.backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return this.dynamicLayerResId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) other;
            return fr.t.c(this.staticLayerResId, custom.staticLayerResId) && fr.t.c(this.dynamicLayerResId, custom.dynamicLayerResId);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return this.staticLayerResId;
        }

        public int hashCode() {
            int iHashCode = this.staticLayerResId.hashCode() * 31;
            er.p<p076m2.r, Integer, Integer> pVar = this.dynamicLayerResId;
            return iHashCode + (pVar == null ? 0 : pVar.hashCode());
        }

        public String toString() {
            return "Custom(staticLayerResId=" + this.staticLayerResId + ", dynamicLayerResId=" + this.dynamicLayerResId + ')';
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$g0;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g0 extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f140844c = new g0();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "sport_shooting_coach_licence_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.i1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.g0.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140848g = 8;

        private g0() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-1553844987);
            if (p076m2.t.k()) {
                p076m2.t.o(-1553844987, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.SportShootingCoachLicence.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:196)");
            }
            int i16 = c20.b.f22684j2;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof g0);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return -1932413594;
        }

        public String toString() {
            return "SportShootingCoachLicence";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$h;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f140849c = new h();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "-1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.x
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.h.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.y
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.h.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private h() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(960881205);
            if (p076m2.t.k()) {
                p076m2.t.o(960881205, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.Default.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:13)");
            }
            int i16 = c20.b.V;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(-374630632);
            if (p076m2.t.k()) {
                p076m2.t.o(-374630632, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.Default.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:12)");
            }
            int i16 = c20.b.U;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof h);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return -1161328455;
        }

        public String toString() {
            return "Default";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$h0;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h0 extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h0 f140853c = new h0();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "sport_shooting_competitor_licence_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.j1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.h0.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140857g = 8;

        private h0() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(56430761);
            if (p076m2.t.k()) {
                p076m2.t.o(56430761, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.SportShootingCompetitorLicence.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:191)");
            }
            int i16 = c20.b.f22708p2;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof h0);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return 1587739574;
        }

        public String toString() {
            return "SportShootingCompetitorLicence";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$i;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class i extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f140858c = new i();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "dentist_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.z
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.i.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.a0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.i.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private i() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(380470471);
            if (p076m2.t.k()) {
                p076m2.t.o(380470471, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.DentistCard.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:31)");
            }
            int i16 = c20.b.N;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(26742826);
            if (p076m2.t.k()) {
                p076m2.t.o(26742826, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.DentistCard.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:30)");
            }
            int i16 = c20.b.L;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof i);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return 1863542091;
        }

        public String toString() {
            return "DentistCard";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$i0;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class i0 extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f140862c = new i0();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "sport_shooting_instructor_licence_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.k1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.i0.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140866g = 8;

        private i0() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(1741142648);
            if (p076m2.t.k()) {
                p076m2.t.o(1741142648, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.SportShootingInstructorLicence.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:201)");
            }
            int i16 = c20.b.f22734y0;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof i0);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return -1432043707;
        }

        public String toString() {
            return "SportShootingInstructorLicence";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$j;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class j extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f140867c = new j();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "dentist_limited_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.b0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.j.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.c0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.j.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private j() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-1582411195);
            if (p076m2.t.k()) {
                p076m2.t.o(-1582411195, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.DentistCardLimited.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:37)");
            }
            int i16 = c20.b.O;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(-352992894);
            if (p076m2.t.k()) {
                p076m2.t.o(-352992894, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.DentistCardLimited.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:36)");
            }
            int i16 = c20.b.M;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof j);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return -1192161841;
        }

        public String toString() {
            return "DentistCardLimited";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$j0;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class j0 extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j0 f140871c = new j0();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "sport_shooting_range_officer_licence_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.l1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.j0.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140875g = 8;

        private j0() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-882327908);
            if (p076m2.t.k()) {
                p076m2.t.o(-882327908, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.SportShootingRangeOfficerLicence.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:216)");
            }
            int i16 = c20.b.f22720t1;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof j0);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return -1366765847;
        }

        public String toString() {
            return "SportShootingRangeOfficerLicence";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$k;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class k extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f140876c = new k();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "deputy_card";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.d0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.k.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.e0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.k.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private k() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-1794172727);
            if (p076m2.t.k()) {
                p076m2.t.o(-1794172727, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.Deputy.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:103)");
            }
            int i16 = c20.b.Q;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(-1837253754);
            if (p076m2.t.k()) {
                p076m2.t.o(-1837253754, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.Deputy.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:102)");
            }
            int i16 = c20.b.P;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof k);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return -1145523757;
        }

        public String toString() {
            return "Deputy";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$k0;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class k0 extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k0 f140880c = new k0();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "sport_shooting_referee_licence_dynamic_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.m1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.k0.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140884g = 8;

        private k0() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-1993174731);
            if (p076m2.t.k()) {
                p076m2.t.o(-1993174731, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.SportShootingRefereeLicenceDynamicShooting.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:211)");
            }
            int i16 = c20.b.V1;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof k0);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return -1972169150;
        }

        public String toString() {
            return "SportShootingRefereeLicenceDynamicShooting";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$l;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class l extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f140885c = new l();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "refugee_background";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.f0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.l.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.g0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.l.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private l() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-1150604645);
            if (p076m2.t.k()) {
                p076m2.t.o(-1150604645, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.Diia.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:157)");
            }
            int i16 = c20.b.Q1;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(11360408);
            if (p076m2.t.k()) {
                p076m2.t.o(11360408, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.Diia.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:156)");
            }
            int i16 = c20.b.P1;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof l);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return -930796315;
        }

        public String toString() {
            return "Diia";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$l0;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class l0 extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l0 f140889c = new l0();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "sport_shooting_referee_licence_static_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.n1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.l0.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140893g = 8;

        private l0() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-888337072);
            if (p076m2.t.k()) {
                p076m2.t.o(-888337072, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.SportShootingRefereeLicenceStaticShooting.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:206)");
            }
            int i16 = c20.b.Y1;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof l0);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return -761492879;
        }

        public String toString() {
            return "SportShootingRefereeLicenceStaticShooting";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$m;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class m extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f140894c = new m();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "disabled_person_identification_card_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.h0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.m.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140898g = 8;

        private m() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-1383930326);
            if (p076m2.t.k()) {
                p076m2.t.o(-1383930326, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.DisabledPersonIdentificationCard.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:66)");
            }
            int i16 = c20.b.T;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof m);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return -33126921;
        }

        public String toString() {
            return "DisabledPersonIdentificationCard";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$m0;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class m0 extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m0 f140899c = new m0();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "student_card";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.o1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.m0.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.p1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.m0.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private m0() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(1884126175);
            if (p076m2.t.k()) {
                p076m2.t.o(1884126175, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.StudentCard.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:55)");
            }
            int i16 = c20.b.f22668f2;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(1530398530);
            if (p076m2.t.k()) {
                p076m2.t.o(1530398530, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.StudentCard.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:54)");
            }
            int i16 = c20.b.f22664e2;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof m0);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return 745706083;
        }

        public String toString() {
            return "StudentCard";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$n;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class n extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f140903c = new n();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "doctor_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.i0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.n.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.j0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.n.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private n() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-266886451);
            if (p076m2.t.k()) {
                p076m2.t.o(-266886451, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.DoctorCard.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:19)");
            }
            int i16 = c20.b.Y;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(2077007626);
            if (p076m2.t.k()) {
                p076m2.t.o(2077007626, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.DoctorCard.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:18)");
            }
            int i16 = c20.b.W;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof n);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return 807498583;
        }

        public String toString() {
            return "DoctorCard";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$n0;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class n0 extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n0 f140907c = new n0();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "tax_advisor_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.q1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.n0.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140911g = 8;

        private n0() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(1012066896);
            if (p076m2.t.k()) {
                p076m2.t.o(1012066896, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.TaxAdvisor.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:126)");
            }
            int i16 = c20.b.I;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof n0);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return 1108995101;
        }

        public String toString() {
            return "TaxAdvisor";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$o;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class o extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f140912c = new o();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "doctor_limited_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.k0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.o.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.l0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.o.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private o() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(260931967);
            if (p076m2.t.k()) {
                p076m2.t.o(260931967, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.DoctorCardLimited.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:25)");
            }
            int i16 = c20.b.Z;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(439137954);
            if (p076m2.t.k()) {
                p076m2.t.o(439137954, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.DoctorCardLimited.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:24)");
            }
            int i16 = c20.b.X;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof o);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return 2066045507;
        }

        public String toString() {
            return "DoctorCardLimited";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$o0;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class o0 extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o0 f140916c = new o0();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "teacher_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.r1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.o0.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140920g = 8;

        private o0() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-1858831751);
            if (p076m2.t.k()) {
                p076m2.t.o(-1858831751, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.Teacher.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:72)");
            }
            int i16 = c20.b.f22672g2;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof o0);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return 149257818;
        }

        public String toString() {
            return "Teacher";
        }
    }

    /* JADX INFO: renamed from: o20.p$p, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$p;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C3482p extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C3482p f140921c = new C3482p();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "driving_licence_main";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.m0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.C3482p.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140925g = 8;

        private C3482p() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(322333854);
            if (p076m2.t.k()) {
                p076m2.t.o(322333854, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.DrivingLicenceMain.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:90)");
            }
            int i16 = c20.b.f22654c0;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C3482p);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return -1561864213;
        }

        public String toString() {
            return "DrivingLicenceMain";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$p0;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class p0 extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p0 f140926c = new p0();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "trainee_attorney_at_law_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.s1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.p0.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.t1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.p0.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private p0() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-181107289);
            if (p076m2.t.k()) {
                p076m2.t.o(-181107289, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.TraineeAttorneyAtLaw.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:49)");
            }
            int i16 = c20.b.D0;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(173873572);
            if (p076m2.t.k()) {
                p076m2.t.o(173873572, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.TraineeAttorneyAtLaw.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:48)");
            }
            int i16 = c20.b.C0;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof p0);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return -724878095;
        }

        public String toString() {
            return "TraineeAttorneyAtLaw";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$q;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class q extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f140930c = new q();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "driving_licence_temporary";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.n0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.q.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140934g = 8;

        private q() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(1399306302);
            if (p076m2.t.k()) {
                p076m2.t.o(1399306302, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.DrivingLicenceTemporary.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:96)");
            }
            int i16 = c20.b.f22658d0;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof q);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return 320944991;
        }

        public String toString() {
            return "DrivingLicenceTemporary";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$q0;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class q0 extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q0 f140935c = new q0();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "uut_card";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.u1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.q0.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140939g = 8;

        private q0() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-547128037);
            if (p076m2.t.k()) {
                p076m2.t.o(-547128037, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.UutCard.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:60)");
            }
            int i16 = c20.b.O1;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof q0);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return 1511415164;
        }

        public String toString() {
            return "UutCard";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$r;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class r extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f140940c = new r();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "electronic_diploma_dsc_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.o0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.r.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140944g = 8;

        private r() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(542818953);
            if (p076m2.t.k()) {
                p076m2.t.o(542818953, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.ElectronicDiplomaDsc.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:231)");
            }
            int i16 = c20.b.f22669g;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof r);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return -189775594;
        }

        public String toString() {
            return "ElectronicDiplomaDsc";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$s;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class s extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f140945c = new s();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "electronic_diploma_graduation_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.p0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.s.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140949g = 8;

        private s() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(906189419);
            if (p076m2.t.k()) {
                p076m2.t.o(906189419, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.ElectronicDiplomaGraduation.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:221)");
            }
            int i16 = c20.b.f22693m;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof s);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return 1862755788;
        }

        public String toString() {
            return "ElectronicDiplomaGraduation";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$t;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class t extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f140950c = new t();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "electronic_diploma_phd_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.q0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.t.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140954g = 8;

        private t() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(1594740801);
            if (p076m2.t.k()) {
                p076m2.t.o(1594740801, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.ElectronicDiplomaPhd.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:226)");
            }
            int i16 = c20.b.f22681j;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof t);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return -189764402;
        }

        public String toString() {
            return "ElectronicDiplomaPhd";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$u;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class u extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f140955c = new u();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "family_card";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.r0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.u.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.s0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.u.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private u() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(337198930);
            if (p076m2.t.k()) {
                p076m2.t.o(337198930, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.FamilyCard.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:115)");
            }
            int i16 = c20.b.f22686k0;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(-1613874289);
            if (p076m2.t.k()) {
                p076m2.t.o(-1613874289, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.FamilyCard.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:114)");
            }
            int i16 = c20.b.f22682j0;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof u);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return -1054764260;
        }

        public String toString() {
            return "FamilyCard";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$v;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class v extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f140959c = new v();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "junior_school_card_mobywatel_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.t0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.v.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.u0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.v.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private v() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-483888065);
            if (p076m2.t.k()) {
                p076m2.t.o(-483888065, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.JuniorSchoolCardMobywatel.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:151)");
            }
            int i16 = c20.b.R1;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(1327355490);
            if (p076m2.t.k()) {
                p076m2.t.o(1327355490, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.JuniorSchoolCardMobywatel.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:150)");
            }
            int i16 = c20.b.S1;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof v);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return -94633981;
        }

        public String toString() {
            return "JuniorSchoolCardMobywatel";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo20/p$w;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "", "Ljava/lang/Void;", "h", "()Ljava/lang/Void;", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class w extends p {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Void dynamicLayerResId = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f140963c = new w();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "laboratory_diagnostician_1";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.v0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.w.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f140967g = 8;

        private w() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(756994163);
            if (p076m2.t.k()) {
                p076m2.t.o(756994163, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.LaboratoryDiagnostician.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:236)");
            }
            int i16 = c20.b.B1;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public /* bridge */ /* synthetic */ er.p e() {
            return (er.p) h();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof w);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public Void h() {
            return dynamicLayerResId;
        }

        public int hashCode() {
            return -1004035372;
        }

        public String toString() {
            return "LaboratoryDiagnostician";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$x;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class x extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f140968c = new x();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "mid_card_background";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.w0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.x.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.x0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.x.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private x() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-1228190260);
            if (p076m2.t.k()) {
                p076m2.t.o(-1228190260, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.MIdCard.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:163)");
            }
            int i16 = c20.b.f22647a1;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(1731265199);
            if (p076m2.t.k()) {
                p076m2.t.o(1731265199, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.MIdCard.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:162)");
            }
            int i16 = c20.b.Z0;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof x);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return 1726861328;
        }

        public String toString() {
            return "MIdCard";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$y;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class y extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f140972c = new y();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "pwz_background";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.y0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.y.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.z0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.y.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private y() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-54709845);
            if (p076m2.t.k()) {
                p076m2.t.o(-54709845, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.NurseMidwifePWZ.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:169)");
            }
            int i16 = c20.b.f22726v1;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(249385870);
            if (p076m2.t.k()) {
                p076m2.t.o(249385870, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.NurseMidwifePWZ.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:168)");
            }
            int i16 = c20.b.f22723u1;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof y);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return 2132292783;
        }

        public String toString() {
            return "NurseMidwifePWZ";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo20/p$z;", "Lo20/p;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "backgroundId", "Lkotlin/Function0;", "e", "Ler/p;", "f", "()Ler/p;", "staticLayerResId", "dynamicLayerResId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class z extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f140976c = new z();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String backgroundId = "pensioner_card";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> staticLayerResId = new er.p() { // from class: o20.a1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.z.j((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<p076m2.r, Integer, Integer> dynamicLayerResId = new er.p() { // from class: o20.b1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(p.z.i((p076m2.r) obj, ((Integer) obj2).intValue()));
            }
        };

        private z() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(p076m2.r rVar, int i15) {
            rVar.X(-1417928913);
            if (p076m2.t.k()) {
                p076m2.t.o(-1417928913, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.Pensioner.dynamicLayerResId.<anonymous> (DocumentComponentBackground.kt:109)");
            }
            int i16 = c20.b.f22687k1;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(p076m2.r rVar, int i15) {
            rVar.X(-649582766);
            if (p076m2.t.k()) {
                p076m2.t.o(-649582766, i15, -1, "pl.gov.coi.common.ui.document.component.DocumentComponentBackground.Pensioner.staticLayerResId.<anonymous> (DocumentComponentBackground.kt:108)");
            }
            int i16 = c20.b.f22683j1;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return i16;
        }

        @Override // o20.p
        /* JADX INFO: renamed from: d */
        public String getBackgroundId() {
            return backgroundId;
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> e() {
            return dynamicLayerResId;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof z);
        }

        @Override // o20.p
        public er.p<p076m2.r, Integer, Integer> f() {
            return staticLayerResId;
        }

        public int hashCode() {
            return -545341197;
        }

        public String toString() {
            return "Pensioner";
        }
    }

    public /* synthetic */ p(fr.k kVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c() {
        return pq.v.q(h.f140849c, n.f140903c, o.f140912c, i.f140858c, j.f140867c, b.f140799c, p0.f140926c, m0.f140899c, q0.f140935c, m.f140894c, o0.f140916c, d.f140817c, e.f140827c, C3482p.f140921c, q.f140930c, k.f140876c, z.f140976c, u.f140955c, a.f140790c, n0.f140907c, c.f140808c, f0.f140836c, v.f140959c, l.f140885c, x.f140968c, y.f140972c, c0.f140812c, d0.f140822c, b0.f140803c, e0.f140831c, h0.f140853c, g0.f140844c, i0.f140862c, l0.f140889c, k0.f140880c, j0.f140871c, s.f140945c, r.f140940c, t.f140950c, w.f140963c, a0.f140794c);
    }

    /* JADX INFO: renamed from: d */
    public abstract String getBackgroundId();

    public abstract er.p<p076m2.r, Integer, Integer> e();

    public abstract er.p<p076m2.r, Integer, Integer> f();

    private p() {
    }
}
