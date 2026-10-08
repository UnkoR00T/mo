package al0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0003\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lal0/g;", "", "", "a", "()Z", "isElectronicSignatureRequired", "b", "c", "Lal0/g$a;", "Lal0/g$b;", "Lal0/g$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {

    /* JADX INFO: renamed from: al0.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0015\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Lal0/g$a;", "Lal0/g;", "", "age", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Z", "()Z", "isElectronicSignatureRequired", "c", "isFingerprintAndSignatureRequired", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Child implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int age;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isElectronicSignatureRequired;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isFingerprintAndSignatureRequired;

        public Child(int i15) {
            this.age = i15;
            this.isElectronicSignatureRequired = i15 >= 13;
            this.isFingerprintAndSignatureRequired = i15 >= 12;
        }

        @Override // al0.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsElectronicSignatureRequired() {
            return this.isElectronicSignatureRequired;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getAge() {
            return this.age;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsFingerprintAndSignatureRequired() {
            return this.isFingerprintAndSignatureRequired;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Child) && this.age == ((Child) other).age;
        }

        public int hashCode() {
            return Integer.hashCode(this.age);
        }

        public String toString() {
            return "Child(age=" + this.age + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lal0/g$b;", "Lal0/g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "a", "()Z", "isElectronicSignatureRequired", "c", "isFingerprintAndSignatureRequired", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f7359a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final boolean isElectronicSignatureRequired = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isFingerprintAndSignatureRequired = true;

        private b() {
        }

        @Override // al0.g
        /* JADX INFO: renamed from: a */
        public boolean getIsElectronicSignatureRequired() {
            return isElectronicSignatureRequired;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -376786264;
        }

        public String toString() {
            return "Myself";
        }
    }

    /* JADX INFO: renamed from: al0.g$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0015\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Lal0/g$c;", "Lal0/g;", "", "age", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Z", "()Z", "isElectronicSignatureRequired", "c", "isFingerprintAndSignatureRequired", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Ward implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int age;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isElectronicSignatureRequired;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isFingerprintAndSignatureRequired;

        public Ward(int i15) {
            this.age = i15;
            this.isElectronicSignatureRequired = 13 <= i15 && i15 < 18;
            this.isFingerprintAndSignatureRequired = i15 >= 12;
        }

        @Override // al0.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsElectronicSignatureRequired() {
            return this.isElectronicSignatureRequired;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getAge() {
            return this.age;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsFingerprintAndSignatureRequired() {
            return this.isFingerprintAndSignatureRequired;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ward) && this.age == ((Ward) other).age;
        }

        public int hashCode() {
            return Integer.hashCode(this.age);
        }

        public String toString() {
            return "Ward(age=" + this.age + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    boolean getIsElectronicSignatureRequired();
}
