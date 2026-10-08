package b32;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import fr.t;
import oq.i0;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lb32/c;", "Lxw/f;", "Lb32/c$a;", "Lcb4/d;", "<init>", "()V", "params", "f", "(Lb32/c$a;)Lcb4/d;", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, DialogData> {

    /* JADX INFO: renamed from: b32.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lb32/c$a;", "", "Ldx/b$c;", "domainError", "<init>", "(Ldx/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b$c;", "()Ldx/b$c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f16375b = dx.b.Business.f45029h;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b.Business domainError;

        public Params(dx.b.Business business) {
            this.domainError = business;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dx.b.Business getDomainError() {
            return this.domainError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.domainError, ((Params) other).domainError);
        }

        public int hashCode() {
            return this.domainError.hashCode();
        }

        public String toString() {
            return "Params(domainError=" + this.domainError + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public DialogData b(Params params) {
        return new DialogData(h.b.f24985a, params.getDomainError().getTitle(), params.getDomainError().getMessage(), new DialogButtonTextData(params.getDomainError().getPrimaryActionLabel(), null, new er.a() { // from class: b32.a
            @Override // er.a
            public final Object a() {
                return c.h();
            }
        }, 2, null), null, null, new er.a() { // from class: b32.b
            @Override // er.a
            public final Object a() {
                return c.i();
            }
        }, 48, null);
    }
}
