package bz3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lbz3/c;", "", "", "isFocused", "<init>", "(Z)V", "a", "Z", "()Z", "b", "Lbz3/c$a;", "Lbz3/c$b;", "setpassword_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isFocused;

    /* JADX INFO: renamed from: bz3.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lbz3/c$a;", "Lbz3/c;", "", "isFocused", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "a", "()Z", "setpassword_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Password extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFocused;

        public Password(boolean z15) {
            super(z15, null);
            this.isFocused = z15;
        }

        @Override // bz3.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsFocused() {
            return this.isFocused;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Password) && this.isFocused == ((Password) other).isFocused;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFocused);
        }

        public String toString() {
            return "Password(isFocused=" + this.isFocused + ')';
        }
    }

    /* JADX INFO: renamed from: bz3.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lbz3/c$b;", "Lbz3/c;", "", "isFocused", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "a", "()Z", "setpassword_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepeatPassword extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFocused;

        public RepeatPassword(boolean z15) {
            super(z15, null);
            this.isFocused = z15;
        }

        @Override // bz3.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsFocused() {
            return this.isFocused;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RepeatPassword) && this.isFocused == ((RepeatPassword) other).isFocused;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFocused);
        }

        public String toString() {
            return "RepeatPassword(isFocused=" + this.isFocused + ')';
        }
    }

    public /* synthetic */ c(boolean z15, fr.k kVar) {
        this(z15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getIsFocused() {
        return this.isFocused;
    }

    private c(boolean z15) {
        this.isFocused = z15;
    }
}
