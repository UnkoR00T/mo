package nr2;

import al0.o0;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import fr.t;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnr2/d;", "Lxw/f;", "Lnr2/d$a;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Lnr2/d$a;)Lcb4/d;", "a", "Lmx/c;", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, DialogData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: nr2.d$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lnr2/d$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onApproveAction", "Lal0/o0;", "passportInvalidationReason", "<init>", "(Ler/a;Lal0/o0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Lal0/o0;", "()Lal0/o0;", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onApproveAction;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final o0 passportInvalidationReason;

        public Params(er.a<i0> aVar, o0 o0Var) {
            this.onApproveAction = aVar;
            this.passportInvalidationReason = o0Var;
        }

        public final er.a<i0> a() {
            return this.onApproveAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final o0 getPassportInvalidationReason() {
            return this.passportInvalidationReason;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.onApproveAction, params.onApproveAction) && this.passportInvalidationReason == params.passportInvalidationReason;
        }

        public int hashCode() {
            return (this.onApproveAction.hashCode() * 31) + this.passportInvalidationReason.hashCode();
        }

        public String toString() {
            return "Params(onApproveAction=" + this.onApproveAction + ", passportInvalidationReason=" + this.passportInvalidationReason + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f137973a;

        static {
            int[] iArr = new int[o0.values().length];
            try {
                iArr[o0.Damage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o0.Lost.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f137973a = iArr;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public DialogData b(final Params params) {
        int i15;
        h.b bVar = h.b.f24985a;
        mx.c cVar = this.labelProvider;
        int i16 = b.f137973a[params.getPassportInvalidationReason().ordinal()];
        if (i16 == 1) {
            i15 = qq2.a.f168108c0;
        } else {
            if (i16 != 2) {
                throw new p();
            }
            i15 = qq2.a.f168110d0;
        }
        return new DialogData(bVar, cVar.c(i15), this.labelProvider.c(qq2.a.f168106b0), new DialogButtonTextData(this.labelProvider.c(qq2.a.f168124o), null, new er.a() { // from class: nr2.a
            @Override // er.a
            public final Object a() {
                return d.i(params);
            }
        }, 2, null), new DialogButtonTextData(this.labelProvider.c(qq2.a.f168128s), null, new er.a() { // from class: nr2.b
            @Override // er.a
            public final Object a() {
                return d.l();
            }
        }, 2, null), null, new er.a() { // from class: nr2.c
            @Override // er.a
            public final Object a() {
                return d.m();
            }
        }, 32, null);
    }
}
