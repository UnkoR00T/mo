package qs2;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.t;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqs2/j;", "Lxw/f;", "Lqs2/j$a;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lqs2/j$a;)Lcb4/d;", "a", "Lmx/c;", "pensionercard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, DialogData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: qs2.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lqs2/j$a;", "", "Lqs2/h;", "dialog", "<init>", "(Lqs2/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqs2/h;", "()Lqs2/h;", "pensionercard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h dialog;

        public Params(h hVar) {
            this.dialog = hVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final h getDialog() {
            return this.dialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.dialog, ((Params) other).dialog);
        }

        public int hashCode() {
            return this.dialog.hashCode();
        }

        public String toString() {
            return "Params(dialog=" + this.dialog + ')';
        }
    }

    public j(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public DialogData b(Params params) {
        if (!(params.getDialog() instanceof h.Refresh)) {
            throw new p();
        }
        cb4.h.b bVar = cb4.h.b.f24985a;
        mx.c cVar = this.labelProvider;
        return new DialogData(bVar, cVar.e(ks2.a.f112612q, cVar.c(ks2.a.f112618w).getText()), this.labelProvider.c(ks2.a.f112611p), new DialogButtonTextData(this.labelProvider.c(ks2.a.f112598c), null, ((h.Refresh) params.getDialog()).a(), 2, null), new DialogButtonTextData(this.labelProvider.c(ks2.a.f112596a), null, new er.a() { // from class: qs2.i
            @Override // er.a
            public final Object a() {
                return j.f();
            }
        }, 2, null), null, null, 96, null);
    }
}
