package iy;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Liy/h;", "", "", "a", "()Ljava/lang/String;", "transformation", "c", "b", "Liy/h$a;", "Liy/h$b;", "Liy/h$c;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\r\u000fB!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Liy/h$a;", "Liy/h;", "", "transformation", "", "saltBytesLength", "Liy/r;", "ivType", "<init>", "(Ljava/lang/String;ILiy/r;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "I", "c", "()I", "Liy/r;", "()Liy/r;", "Liy/h$a$a;", "Liy/h$a$b;", "Liy/h$a$c;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String transformation;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int saltBytesLength;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final r ivType;

        /* JADX INFO: renamed from: iy.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Liy/h$a$a;", "Liy/h$a;", "Liy/r;", "ivType", "", "saltBytesLength", "<init>", "(Liy/r;I)V", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C2298a extends a {
            public C2298a(r rVar, int i15) {
                super("AES/CBC/PKCS5Padding", i15, rVar, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Liy/h$a$b;", "Liy/h$a;", "", "tagLength", "Liy/r;", "ivType", "saltBytesLength", "<init>", "(ILiy/r;I)V", "d", "I", "()I", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final int tagLength;

            public /* synthetic */ b(int i15, r rVar, int i16, int i17, fr.k kVar) {
                this((i17 & 1) != 0 ? 128 : i15, rVar, i16);
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final int getTagLength() {
                return this.tagLength;
            }

            public b(int i15, r rVar, int i16) {
                super("AES/GCM/NoPadding", i16, rVar, null);
                this.tagLength = i15;
            }
        }

        public /* synthetic */ a(String str, int i15, r rVar, fr.k kVar) {
            this(str, i15, rVar);
        }

        @Override // iy.h
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getTransformation() {
            return this.transformation;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public r getIvType() {
            return this.ivType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public int getSaltBytesLength() {
            return this.saltBytesLength;
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Liy/h$a$c;", "Liy/h$a;", "", "wrappedKeyAlgorithm", "", "wrappedKeyType", "Liy/r;", "ivType", "saltBytesLength", "<init>", "(Ljava/lang/String;ILiy/r;I)V", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "I", "()I", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final String wrappedKeyAlgorithm;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final int wrappedKeyType;

            public /* synthetic */ c(String str, int i15, r rVar, int i16, int i17, fr.k kVar) {
                this((i17 & 1) != 0 ? "AES" : str, (i17 & 2) != 0 ? 3 : i15, rVar, i16);
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getWrappedKeyAlgorithm() {
                return this.wrappedKeyAlgorithm;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final int getWrappedKeyType() {
                return this.wrappedKeyType;
            }

            public c(String str, int i15, r rVar, int i16) {
                super("AESWrap", i16, rVar, null);
                this.wrappedKeyAlgorithm = str;
                this.wrappedKeyType = i15;
            }
        }

        private a(String str, int i15, r rVar) {
            this.transformation = str;
            this.saltBytesLength = i15;
            this.ivType = rVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0001\f¨\u0006\r"}, d2 = {"Liy/h$b;", "Liy/h;", "", "transformation", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "", "attestationChallenge", "[B", "b", "()[B", "Liy/h$b$a;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b implements h {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liy/h$b$a;", "Liy/h$b;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends b {
        }

        @Override // iy.h
        /* JADX INFO: renamed from: a */
        public abstract String getTransformation();

        public abstract byte[] b();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\n\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Liy/h$c;", "Liy/h;", "", "transformation", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "b", "Liy/h$c$a;", "Liy/h$c$b;", "Liy/h$c$c;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String transformation;

        /* JADX INFO: renamed from: iy.h$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Liy/h$c$a;", "Liy/h$c;", "", "transformation", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Other extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String transformation;

            public Other(String str) {
                super(str, null);
                this.transformation = str;
            }

            @Override // iy.h.c, iy.h
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getTransformation() {
                return this.transformation;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Other) && fr.t.c(this.transformation, ((Other) other).transformation);
            }

            public int hashCode() {
                return this.transformation.hashCode();
            }

            public String toString() {
                return "Other(transformation=" + this.transformation + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Liy/h$c$b;", "Liy/h$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f97755b = new b();

            private b() {
                super("RSA/ECB/OAEPWithSHA-256AndMGF1Padding", null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1041815262;
            }

            public String toString() {
                return "RSA_ECB_OAEPWithSHA256_And_MGF1_Padding";
            }
        }

        /* JADX INFO: renamed from: iy.h$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Liy/h$c$c;", "Liy/h$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C2299c extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C2299c f97756b = new C2299c();

            private C2299c() {
                super("RSA/ECB/PKCS1Padding", null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2299c);
            }

            public int hashCode() {
                return 1311466946;
            }

            public String toString() {
                return "RSA_ECB_PKCS1_Padding";
            }
        }

        public /* synthetic */ c(String str, fr.k kVar) {
            this(str);
        }

        @Override // iy.h
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getTransformation() {
            return this.transformation;
        }

        private c(String str) {
            this.transformation = str;
        }
    }

    /* JADX INFO: renamed from: a */
    String getTransformation();
}
