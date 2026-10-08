package yz1;

import fr.t;
import p071kotlin.Metadata;
import un0.ElectionSupportsHistoryGrantedSupport;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lyz1/a;", "", "b", "a", "Lyz1/a$a;", "Lyz1/a$b;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: yz1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lyz1/a$a;", "Lyz1/a;", "Lun0/l;", "grantedSupport", "<init>", "(Lun0/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lun0/l;", "()Lun0/l;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActionSelect implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ElectionSupportsHistoryGrantedSupport grantedSupport;

        public ActionSelect(ElectionSupportsHistoryGrantedSupport electionSupportsHistoryGrantedSupport) {
            this.grantedSupport = electionSupportsHistoryGrantedSupport;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ElectionSupportsHistoryGrantedSupport getGrantedSupport() {
            return this.grantedSupport;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActionSelect) && t.c(this.grantedSupport, ((ActionSelect) other).grantedSupport);
        }

        public int hashCode() {
            return this.grantedSupport.hashCode();
        }

        public String toString() {
            return "ActionSelect(grantedSupport=" + this.grantedSupport + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lyz1/a$b;", "Lyz1/a;", "a", "b", "Lyz1/a$b$a;", "Lyz1/a$b$b;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends a {

        /* JADX INFO: renamed from: yz1.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyz1/a$b$a;", "Lyz1/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C6210a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C6210a f230924a = new C6210a();

            private C6210a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C6210a);
            }

            public int hashCode() {
                return -214973067;
            }

            public String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: yz1.a$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lyz1/a$b$b;", "Lyz1/a$b;", "", "actionName", "Lun0/l;", "grantedSupport", "<init>", "(Ljava/lang/String;Lun0/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lun0/l;", "()Lun0/l;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Next implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String actionName;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ElectionSupportsHistoryGrantedSupport grantedSupport;

            public Next(String str, ElectionSupportsHistoryGrantedSupport electionSupportsHistoryGrantedSupport) {
                this.actionName = str;
                this.grantedSupport = electionSupportsHistoryGrantedSupport;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getActionName() {
                return this.actionName;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ElectionSupportsHistoryGrantedSupport getGrantedSupport() {
                return this.grantedSupport;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Next)) {
                    return false;
                }
                Next next = (Next) other;
                return t.c(this.actionName, next.actionName) && t.c(this.grantedSupport, next.grantedSupport);
            }

            public int hashCode() {
                return (this.actionName.hashCode() * 31) + this.grantedSupport.hashCode();
            }

            public String toString() {
                return "Next(actionName=" + this.actionName + ", grantedSupport=" + this.grantedSupport + ')';
            }
        }
    }
}
