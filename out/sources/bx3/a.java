package bx3;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.t;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000b\rB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lbx3/a;", "Lxw/f;", "Lbx3/a$a;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lbx3/a$a;)Lcb4/d;", "a", "Lmx/c;", "b", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements xw.f<Params, DialogData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: bx3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Lbx3/a$a;", "", "Lbx3/a$b;", "dialogType", "Lkotlin/Function0;", "Loq/i0;", "confirmAction", "cancelAction", "abortAction", "<init>", "(Lbx3/a$b;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbx3/a$b;", "d", "()Lbx3/a$b;", "b", "Ler/a;", "c", "()Ler/a;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b dialogType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> confirmAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> cancelAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> abortAction;

        public Params(b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.dialogType = bVar;
            this.confirmAction = aVar;
            this.cancelAction = aVar2;
            this.abortAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.abortAction;
        }

        public final er.a<i0> b() {
            return this.cancelAction;
        }

        public final er.a<i0> c() {
            return this.confirmAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b getDialogType() {
            return this.dialogType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.dialogType == params.dialogType && t.c(this.confirmAction, params.confirmAction) && t.c(this.cancelAction, params.cancelAction) && t.c(this.abortAction, params.abortAction);
        }

        public int hashCode() {
            return (((((this.dialogType.hashCode() * 31) + this.confirmAction.hashCode()) * 31) + this.cancelAction.hashCode()) * 31) + this.abortAction.hashCode();
        }

        public String toString() {
            return "Params(dialogType=" + this.dialogType + ", confirmAction=" + this.confirmAction + ", cancelAction=" + this.cancelAction + ", abortAction=" + this.abortAction + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lbx3/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        CLOSE,
        CONFIRM_VALID,
        CONFIRM_INVALID;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f21931e = wq.b.a(b());
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21932a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.CONFIRM_VALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.CONFIRM_INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21932a = iArr;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public DialogData b(Params params) {
        mx.c cVar = this.labelProvider;
        int i15 = c.f21932a[params.getDialogType().ordinal()];
        if (i15 == 1) {
            return new DialogData(cb4.h.b.f24985a, cVar.c(bw3.a.Z), cVar.c(bw3.a.Y), new DialogButtonTextData(cVar.c(bw3.a.f21862c), null, params.b(), 2, null), new DialogButtonTextData(cVar.c(bw3.a.f21874i), null, params.a(), 2, null), null, params.a(), 32, null);
        }
        if (i15 == 2) {
            return new DialogData(cb4.h.b.f24985a, cVar.c(bw3.a.f21863c0), cVar.c(bw3.a.f21861b0), new DialogButtonTextData(cVar.c(bw3.a.f21884n), null, params.c(), 2, null), new DialogButtonTextData(cVar.c(bw3.a.f21860b), null, params.a(), 2, null), null, params.a(), 32, null);
        }
        if (i15 != 3) {
            throw new p();
        }
        return new DialogData(cb4.h.b.f24985a, cVar.c(bw3.a.f21863c0), cVar.c(bw3.a.f21859a0), new DialogButtonTextData(cVar.c(bw3.a.f21884n), null, params.c(), 2, null), new DialogButtonTextData(cVar.c(bw3.a.f21860b), null, params.a(), 2, null), null, params.a(), 32, null);
    }
}
