package g73;

import fr.k;
import fr.t;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lg73/a;", "", "b", "a", "Lg73/a$a;", "Lg73/a$b;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: g73.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"Lg73/a$a;", "Lg73/a;", "Lkotlin/Function0;", "Loq/i0;", "turnOnBiometricAction", "finishProcessAction", "<init>", "(Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "b", "()Ler/a;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ResetBiometricDialog implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> turnOnBiometricAction;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> finishProcessAction;

        public ResetBiometricDialog(er.a<i0> aVar, er.a<i0> aVar2) {
            this.turnOnBiometricAction = aVar;
            this.finishProcessAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.finishProcessAction;
        }

        public final er.a<i0> b() {
            return this.turnOnBiometricAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResetBiometricDialog)) {
                return false;
            }
            ResetBiometricDialog resetBiometricDialog = (ResetBiometricDialog) other;
            return t.c(this.turnOnBiometricAction, resetBiometricDialog.turnOnBiometricAction) && t.c(this.finishProcessAction, resetBiometricDialog.finishProcessAction);
        }

        public int hashCode() {
            return (this.turnOnBiometricAction.hashCode() * 31) + this.finishProcessAction.hashCode();
        }

        public String toString() {
            return "ResetBiometricDialog(turnOnBiometricAction=" + this.turnOnBiometricAction + ", finishProcessAction=" + this.finishProcessAction + ')';
        }
    }

    /* JADX INFO: renamed from: g73.a$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lg73/a$b;", "Lg73/a;", "Lkotlin/Function0;", "Loq/i0;", "onProcessTerminationAction", "onCloseAction", "<init>", "(Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "d", "()Ler/a;", "b", "c", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TerminationProcessDialog implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onProcessTerminationAction;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        public TerminationProcessDialog(er.a<i0> aVar, er.a<i0> aVar2) {
            this.onProcessTerminationAction = aVar;
            this.onCloseAction = aVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b() {
            return i0.f148189a;
        }

        public final er.a<i0> c() {
            return this.onCloseAction;
        }

        public final er.a<i0> d() {
            return this.onProcessTerminationAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TerminationProcessDialog)) {
                return false;
            }
            TerminationProcessDialog terminationProcessDialog = (TerminationProcessDialog) other;
            return t.c(this.onProcessTerminationAction, terminationProcessDialog.onProcessTerminationAction) && t.c(this.onCloseAction, terminationProcessDialog.onCloseAction);
        }

        public int hashCode() {
            return (this.onProcessTerminationAction.hashCode() * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "TerminationProcessDialog(onProcessTerminationAction=" + this.onProcessTerminationAction + ", onCloseAction=" + this.onCloseAction + ')';
        }

        public /* synthetic */ TerminationProcessDialog(er.a aVar, er.a aVar2, int i15, k kVar) {
            this(aVar, (i15 & 2) != 0 ? new er.a() { // from class: g73.b
                @Override // er.a
                public final Object a() {
                    return a.TerminationProcessDialog.b();
                }
            } : aVar2);
        }
    }
}
