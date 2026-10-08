package yu1;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lyu1/c;", "Lxw/f;", "Lyu1/c$a;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lyu1/c$a;)Lcb4/d;", "a", "Lmx/c;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements xw.f<Params, DialogData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: yu1.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lyu1/c$a;", "", "Lyu1/a;", "dialog", "<init>", "(Lyu1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyu1/a;", "()Lyu1/a;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a dialog;

        public Params(a aVar) {
            this.dialog = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getDialog() {
            return this.dialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.dialog, ((Params) other).dialog);
        }

        public int hashCode() {
            return this.dialog.hashCode();
        }

        public String toString() {
            return "Params(dialog=" + this.dialog + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public DialogData b(Params params) {
        if (params.getDialog() instanceof a.Refresh) {
            return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(iu1.a.f97180z), this.labelProvider.c(iu1.a.f97178y), new DialogButtonTextData(this.labelProvider.c(iu1.a.f97138e), null, ((a.Refresh) params.getDialog()).a(), 2, null), new DialogButtonTextData(this.labelProvider.c(iu1.a.f97132b), null, new er.a() { // from class: yu1.b
                @Override // er.a
                public final Object a() {
                    return c.f();
                }
            }, 2, null), null, null, 96, null);
        }
        throw new oq.p();
    }
}
