package r04;

import iy.h;
import iy.r;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lr04/c;", "Lgz/a;", "Lr04/c$a;", "Liy/h$a;", "<init>", "()V", "params", "b", "(Lr04/c$a;)Liy/h$a;", "a", "cloudstorage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.a<a, h.a> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lr04/c$a;", "Lgz/b$a;", "", "ivBytes", "<init>", "([B)V", "a", "[B", "()[B", "cloudstorage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final byte[] ivBytes;

        public a(byte[] bArr) {
            this.ivBytes = bArr;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final byte[] getIvBytes() {
            return this.ivBytes;
        }
    }

    public h.a b(a params) {
        return new h.a.b(0, new r.b(params.getIvBytes()), 0, 1, null);
    }
}
