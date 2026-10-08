package ml2;

import dx.i;
import fr.t;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sq0.BENationalCourtRegisterEntry;
import sq0.BESubscription;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0017\u0019B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\f\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lml2/f;", "", "Lml2/f$a;", "Lml2/f$b;", "Luq0/a;", "createSubscriptionUC", "Luq0/c;", "editSubscriptionUC", "Lll2/a;", "subscriptionRepository", "<init>", "(Luq0/a;Luq0/c;Lll2/a;)V", "params", "Ldx/i;", "Ldx/b;", "Lml2/f$b$b;", "f", "(Lml2/f$a;Ltq/e;)Ljava/lang/Object;", "Lsq0/i;", "existingSubscription", "h", "(Lml2/f$a;Lsq0/i;Ltq/e;)Ljava/lang/Object;", "g", "a", "Luq0/a;", "b", "Luq0/c;", "c", "Lll2/a;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final uq0.a createSubscriptionUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final uq0.c editSubscriptionUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ll2.a subscriptionRepository;

    /* JADX INFO: renamed from: ml2.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u001e\u0010\u000e¨\u0006\""}, d2 = {"Lml2/f$a;", "Lgz/b$a;", "Lsq0/h;", "entry", "Lfz/b$c;", "dateTo", "", "Lsq0/a;", "channels", "", "email", "<init>", "(Lsq0/h;Lfz/b$c;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsq0/h;", "d", "()Lsq0/h;", "b", "Lfz/b$c;", "()Lfz/b$c;", "c", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/String;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BENationalCourtRegisterEntry entry;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.LocalDate dateTo;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<sq0.a> channels;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(BENationalCourtRegisterEntry bENationalCourtRegisterEntry, fz.b.LocalDate localDate, List<? extends sq0.a> list, String str) {
            this.entry = bENationalCourtRegisterEntry;
            this.dateTo = localDate;
            this.channels = list;
            this.email = str;
        }

        public final List<sq0.a> a() {
            return this.channels;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final fz.b.LocalDate getDateTo() {
            return this.dateTo;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BENationalCourtRegisterEntry getEntry() {
            return this.entry;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.entry, params.entry) && t.c(this.dateTo, params.dateTo) && t.c(this.channels, params.channels) && t.c(this.email, params.email);
        }

        public int hashCode() {
            int iHashCode = ((((this.entry.hashCode() * 31) + this.dateTo.hashCode()) * 31) + this.channels.hashCode()) * 31;
            String str = this.email;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Params(entry=" + this.entry + ", dateTo=" + this.dateTo + ", channels=" + this.channels + ", email=" + this.email + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lml2/f$b;", "", "b", "a", "Lml2/f$b$a;", "Lml2/f$b$b;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lml2/f$b$a;", "Lml2/f$b;", "<init>", "()V", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f127109a = new a();

            private a() {
            }
        }

        /* JADX INFO: renamed from: ml2.f$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lml2/f$b$b;", "Lml2/f$b;", "<init>", "()V", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C3134b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3134b f127110a = new C3134b();

            private C3134b() {
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f127111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f127112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f127113f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f127114g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f127115h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f127116j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f127118l;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f127116j = obj;
            this.f127118l |= PKIFailureInfo.systemUnavail;
            return f.this.f(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f127119d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f127120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f127121f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f127122g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f127123h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f127124j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f127125k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f127127m;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f127125k = obj;
            this.f127127m |= PKIFailureInfo.systemUnavail;
            return f.this.h(null, null, this);
        }
    }

    public f(uq0.a aVar, uq0.c cVar, ll2.a aVar2) {
        this.createSubscriptionUC = aVar;
        this.editSubscriptionUC = cVar;
        this.subscriptionRepository = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        if (r2.X(r4, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(ml2.f.Params r13, tq.e<? super dx.i<? extends dx.b, ml2.f.b.C3134b>> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.f.f(ml2.f$a, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f3, code lost:
    
        if (r8.X(r9, r2) == r3) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(ml2.f.Params r18, sq0.BESubscription r19, tq.e<? super dx.i<? extends dx.b, ml2.f.b.C3134b>> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.f.h(ml2.f$a, sq0.i, tq.e):java.lang.Object");
    }

    public Object g(Params params, tq.e<? super i<? extends dx.b, ? extends b>> eVar) throws Throwable {
        BESubscription subscription = params.getEntry().getSubscription();
        if (subscription != null) {
            Object objH = h(params, subscription, eVar);
            return objH == uq.b.e() ? objH : (i) objH;
        }
        if (params.a().isEmpty()) {
            return new i.Right(b.a.f127109a);
        }
        Object objF = f(params, eVar);
        return objF == uq.b.e() ? objF : (i) objF;
    }
}
