package o24;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0007\u0005\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lo24/y0;", "", "", "scopeKey", "", "a", "(Ljava/lang/String;)Z", "b", "c", "Lo24/y0$a;", "Lo24/y0$b;", "Lo24/y0$c;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface y0 {

    /* JADX INFO: renamed from: o24.y0$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lo24/y0$a;", "Lo24/y0;", "", "scopeName", "<init>", "(Ljava/lang/String;)V", "scopeKey", "", "a", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Contains implements y0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String scopeName;

        public Contains(String str) {
            this.scopeName = str;
        }

        @Override // o24.y0
        public boolean a(String scopeKey) {
            return fu.r.d0(scopeKey, this.scopeName, false, 2, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Contains) && fr.t.c(this.scopeName, ((Contains) other).scopeName);
        }

        public int hashCode() {
            return this.scopeName.hashCode();
        }

        public String toString() {
            return "Contains(scopeName=" + this.scopeName + ')';
        }
    }

    /* JADX INFO: renamed from: o24.y0$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lo24/y0$b;", "Lo24/y0;", "", "scopeName", "<init>", "(Ljava/lang/String;)V", "scopeKey", "", "a", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Equal implements y0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String scopeName;

        public Equal(String str) {
            this.scopeName = str;
        }

        @Override // o24.y0
        public boolean a(String scopeKey) {
            return fr.t.c(scopeKey, this.scopeName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Equal) && fr.t.c(this.scopeName, ((Equal) other).scopeName);
        }

        public int hashCode() {
            return this.scopeName.hashCode();
        }

        public String toString() {
            return "Equal(scopeName=" + this.scopeName + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo24/y0$c;", "Lo24/y0;", "<init>", "()V", "", "scopeKey", "", "a", "(Ljava/lang/String;)Z", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements y0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f141687a = new c();

        private c() {
        }

        @Override // o24.y0
        public boolean a(String scopeKey) {
            return true;
        }
    }

    boolean a(String scopeKey);
}
