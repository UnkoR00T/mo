package fe;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class b<Data> implements o<byte[], Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1399b<Data> f61620a;

    public static class a implements p<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: fe.b$a$a, reason: collision with other inner class name */
        class C1398a implements InterfaceC1399b<ByteBuffer> {
            C1398a() {
            }

            @Override // fe.b.InterfaceC1399b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // fe.b.InterfaceC1399b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // fe.p
        public o<byte[], ByteBuffer> d(s sVar) {
            return new b(new C1398a());
        }
    }

    /* JADX INFO: renamed from: fe.b$b, reason: collision with other inner class name */
    public interface InterfaceC1399b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    private static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f61622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC1399b<Data> f61623b;

        c(byte[] bArr, InterfaceC1399b<Data> interfaceC1399b) {
            this.f61622a = bArr;
            this.f61623b = interfaceC1399b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f61623b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public zd.a d() {
            return zd.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            aVar.f(this.f61623b.b(this.f61622a));
        }
    }

    public static class d implements p<byte[], InputStream> {

        class a implements InterfaceC1399b<InputStream> {
            a() {
            }

            @Override // fe.b.InterfaceC1399b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // fe.b.InterfaceC1399b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // fe.p
        public o<byte[], InputStream> d(s sVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC1399b<Data> interfaceC1399b) {
        this.f61620a = interfaceC1399b;
    }

    @Override // fe.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> a(byte[] bArr, int i15, int i16, zd.h hVar) {
        return new o.a<>(new ue.d(bArr), new c(bArr, this.f61620a));
    }

    @Override // fe.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(byte[] bArr) {
        return true;
    }
}
