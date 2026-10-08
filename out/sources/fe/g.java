package fe;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class g<Data> implements o<File, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d<Data> f61642a;

    public static class a<Data> implements p<File, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<Data> f61643a;

        public a(d<Data> dVar) {
            this.f61643a = dVar;
        }

        @Override // fe.p
        public final o<File, Data> d(s sVar) {
            return new g(this.f61643a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            @Override // fe.g.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // fe.g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // fe.g.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    private static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f61644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d<Data> f61645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Data f61646c;

        c(File file, d<Data> dVar) {
            this.f61644a = file;
            this.f61645b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f61645b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Data data = this.f61646c;
            if (data != null) {
                try {
                    this.f61645b.b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public zd.a d() {
            return zd.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            try {
                Data dataC = this.f61645b.c(this.f61644a);
                this.f61646c = dataC;
                aVar.f(dataC);
            } catch (FileNotFoundException e15) {
                aVar.c(e15);
            }
        }
    }

    public interface d<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(File file);
    }

    public static class e extends a<InputStream> {

        class a implements d<InputStream> {
            a() {
            }

            @Override // fe.g.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // fe.g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // fe.g.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) {
                return io.sentry.instrumentation.file.h.b.a(new FileInputStream(file), file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d<Data> dVar) {
        this.f61642a = dVar;
    }

    @Override // fe.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> a(File file, int i15, int i16, zd.h hVar) {
        return new o.a<>(new ue.d(file), new c(file, this.f61642a));
    }

    @Override // fe.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(File file) {
        return true;
    }
}
