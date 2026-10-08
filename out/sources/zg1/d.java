package zg1;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import fr.t;
import oq.i0;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lzg1/d;", "Lxw/f;", "Lzg1/d$a;", "Lcb4/d;", "<init>", "()V", "params", "c", "(Lzg1/d$a;)Lcb4/d;", "a", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, DialogData> {

    /* JADX INFO: renamed from: zg1.d$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lzg1/d$a;", "", "Ldx/b$c;", "errorData", "Lkotlin/Function0;", "Loq/i0;", "onRetryClick", "onCloseDialog", "<init>", "(Ldx/b$c;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b$c;", "()Ldx/b$c;", "b", "Ler/a;", "c", "()Ler/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f235139d = dx.b.Business.f45029h;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b.Business errorData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRetryClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseDialog;

        public Params(dx.b.Business business, er.a<i0> aVar, er.a<i0> aVar2) {
            this.errorData = business;
            this.onRetryClick = aVar;
            this.onCloseDialog = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dx.b.Business getErrorData() {
            return this.errorData;
        }

        public final er.a<i0> b() {
            return this.onCloseDialog;
        }

        public final er.a<i0> c() {
            return this.onRetryClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.errorData, params.errorData) && t.c(this.onRetryClick, params.onRetryClick) && t.c(this.onCloseDialog, params.onCloseDialog);
        }

        public int hashCode() {
            return (((this.errorData.hashCode() * 31) + this.onRetryClick.hashCode()) * 31) + this.onCloseDialog.hashCode();
        }

        public String toString() {
            return "Params(errorData=" + this.errorData + ", onRetryClick=" + this.onRetryClick + ", onCloseDialog=" + this.onCloseDialog + ')';
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public DialogData b(Params params) {
        return new DialogData(h.b.f24985a, params.getErrorData().getTitle(), params.getErrorData().getMessage(), new DialogButtonTextData(params.getErrorData().getPrimaryActionLabel(), null, params.c(), 2, null), new DialogButtonTextData(params.getErrorData().getSecondaryActionLabel(), null, params.b(), 2, null), null, params.b(), 32, null);
    }
}
