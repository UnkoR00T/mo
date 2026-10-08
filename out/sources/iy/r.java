package iy;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Liy/r;", "", "c", "b", "a", "Liy/r$a;", "Liy/r$b;", "Liy/r$c;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface r {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Liy/r$b;", "Liy/r;", "", "ivBytes", "<init>", "([B)V", "a", "[B", "()[B", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final byte[] ivBytes;

        public b(byte[] bArr) {
            this.ivBytes = bArr;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final byte[] getIvBytes() {
            return this.ivBytes;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Liy/r$c;", "Liy/r;", "", "ivBytesLength", "Liy/q;", "ivPlace", "<init>", "(ILiy/q;)V", "a", "I", "()I", "b", "Liy/q;", "()Liy/q;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int ivBytesLength;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q ivPlace;

        public c(int i15, q qVar) {
            this.ivBytesLength = i15;
            this.ivPlace = qVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIvBytesLength() {
            return this.ivBytesLength;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final q getIvPlace() {
            return this.ivPlace;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Liy/r$a;", "Liy/r;", "", "ivBytesLength", "<init>", "(I)V", "a", "I", "()I", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int ivBytesLength;

        public a(int i15) {
            this.ivBytesLength = i15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIvBytesLength() {
            return this.ivBytesLength;
        }

        public /* synthetic */ a(int i15, int i16, fr.k kVar) {
            this((i16 & 1) != 0 ? 12 : i15);
        }
    }
}
