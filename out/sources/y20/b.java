package y20;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Ly20/b;", "", "", "toggleEnabled", "<init>", "(Z)V", "a", "Z", "()Z", "b", "Ly20/b$a;", "Ly20/b$b;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f223429b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean toggleEnabled;

    public /* synthetic */ b(boolean z15, k kVar) {
        this(z15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getToggleEnabled() {
        return this.toggleEnabled;
    }

    /* JADX INFO: renamed from: y20.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ly20/b$a;", "Ly20/b;", "", "toggleEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Z", "a", "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AnimationsDisabled extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean toggleEnabled;

        public AnimationsDisabled(boolean z15) {
            super(z15, null);
            this.toggleEnabled = z15;
        }

        @Override // y20.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getToggleEnabled() {
            return this.toggleEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AnimationsDisabled) && this.toggleEnabled == ((AnimationsDisabled) other).toggleEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.toggleEnabled);
        }

        public String toString() {
            return "AnimationsDisabled(toggleEnabled=" + this.toggleEnabled + ')';
        }

        public /* synthetic */ AnimationsDisabled(boolean z15, int i15, k kVar) {
            this((i15 & 1) != 0 ? true : z15);
        }
    }

    /* JADX INFO: renamed from: y20.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ly20/b$b;", "Ly20/b;", "", "toggleEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Z", "a", "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AnimationsEnabled extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean toggleEnabled;

        public AnimationsEnabled(boolean z15) {
            super(z15, null);
            this.toggleEnabled = z15;
        }

        @Override // y20.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getToggleEnabled() {
            return this.toggleEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AnimationsEnabled) && this.toggleEnabled == ((AnimationsEnabled) other).toggleEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.toggleEnabled);
        }

        public String toString() {
            return "AnimationsEnabled(toggleEnabled=" + this.toggleEnabled + ')';
        }

        public /* synthetic */ AnimationsEnabled(boolean z15, int i15, k kVar) {
            this((i15 & 1) != 0 ? false : z15);
        }
    }

    private b(boolean z15) {
        this.toggleEnabled = z15;
    }
}
