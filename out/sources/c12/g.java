package c12;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import eo0.y0;
import fr.t;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lc12/g;", "Lxw/f;", "Lc12/g$a;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "i", "(Lc12/g$a;)Lcb4/d;", "a", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, DialogData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22577a;

        static {
            int[] iArr = new int[y0.values().length];
            try {
                iArr[y0.E_DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y0.E_PUAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22577a = iArr;
        }
    }

    public g(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public DialogData b(Params params) {
        int i15 = b.f22577a[params.getMessageServiceType().ordinal()];
        if (i15 == 1) {
            return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(e02.a.f46543h4), null, new DialogButtonTextData(this.labelProvider.c(e02.a.f46569m0), null, params.e(), 2, null), new DialogButtonTextData(this.labelProvider.c(e02.a.f46512c3), null, params.c(), 2, null), new DialogButtonTextData(this.labelProvider.c(e02.a.f46531f4), null, new er.a() { // from class: c12.b
                @Override // er.a
                public final Object a() {
                    return g.l();
                }
            }, 2, null), new er.a() { // from class: c12.c
                @Override // er.a
                public final Object a() {
                    return g.m();
                }
            }, 4, null);
        }
        if (i15 != 2 && i15 != 3) {
            throw new p();
        }
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(e02.a.f46510c1), this.labelProvider.c(e02.a.f46504b1), new DialogButtonTextData(this.labelProvider.c(e02.a.f46563l0), null, new er.a() { // from class: c12.d
            @Override // er.a
            public final Object a() {
                return g.q();
            }
        }, 2, null), new DialogButtonTextData(this.labelProvider.c(e02.a.f46557k0), null, params.c(), 2, null), null, new er.a() { // from class: c12.e
            @Override // er.a
            public final Object a() {
                return g.r();
            }
        }, 32, null);
    }

    /* JADX INFO: renamed from: c12.g$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017¨\u0006\u001d"}, d2 = {"Lc12/g$a;", "", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "Leo0/y0;", "messageServiceType", "saveDraftAction", "<init>", "(Ler/a;Leo0/y0;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "c", "()Ler/a;", "b", "Leo0/y0;", "d", "()Leo0/y0;", "e", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final y0 messageServiceType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> saveDraftAction;

        public Params(er.a<i0> aVar, y0 y0Var, er.a<i0> aVar2) {
            this.closeAction = aVar;
            this.messageServiceType = y0Var;
            this.saveDraftAction = aVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b() {
            return i0.f148189a;
        }

        public final er.a<i0> c() {
            return this.closeAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final y0 getMessageServiceType() {
            return this.messageServiceType;
        }

        public final er.a<i0> e() {
            return this.saveDraftAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.closeAction, params.closeAction) && this.messageServiceType == params.messageServiceType && t.c(this.saveDraftAction, params.saveDraftAction);
        }

        public int hashCode() {
            return (((this.closeAction.hashCode() * 31) + this.messageServiceType.hashCode()) * 31) + this.saveDraftAction.hashCode();
        }

        public String toString() {
            return "Params(closeAction=" + this.closeAction + ", messageServiceType=" + this.messageServiceType + ", saveDraftAction=" + this.saveDraftAction + ')';
        }

        public /* synthetic */ Params(er.a aVar, y0 y0Var, er.a aVar2, int i15, fr.k kVar) {
            this(aVar, y0Var, (i15 & 4) != 0 ? new er.a() { // from class: c12.f
                @Override // er.a
                public final Object a() {
                    return g.Params.b();
                }
            } : aVar2);
        }
    }
}
