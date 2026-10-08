package o81;

import fr.t;
import jb4.ErrorActionData;
import mx.c;
import oq.i0;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lo81/a;", "Lxw/f;", "Lo81/a$a;", "Ljb4/b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Ljb4/b$d;", "c", "(Lo81/a$a;)Ljb4/b$d;", "a", "Lmx/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: o81.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lo81/a$a;", "", "Lkotlin/Function0;", "Loq/i0;", "retryAction", "skipAction", "<init>", "(Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> retryAction;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> skipAction;

        public Params(er.a<i0> aVar, er.a<i0> aVar2) {
            this.retryAction = aVar;
            this.skipAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.retryAction;
        }

        public final er.a<i0> b() {
            return this.skipAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.retryAction, params.retryAction) && t.c(this.skipAction, params.skipAction);
        }

        public int hashCode() {
            return (this.retryAction.hashCode() * 31) + this.skipAction.hashCode();
        }

        public String toString() {
            return "Params(retryAction=" + this.retryAction + ", skipAction=" + this.skipAction + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public jb4.b.Warning b(Params params) {
        return new jb4.b.Warning(this.labelProvider.c(w51.a.f210410r0), this.labelProvider.c(w51.a.f210403q0), null, new ErrorActionData(this.labelProvider.c(w51.a.I4), params.a()), new ErrorActionData(this.labelProvider.c(w51.a.D4), params.b()), null, new ErrorActionData(null, params.b(), 1, null), 36, null);
    }
}
