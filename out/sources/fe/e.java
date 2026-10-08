package fe;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class e<Model, Data> implements o<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a<Data> f61626a;

    public interface a<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(String str);
    }

    private static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f61627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a<Data> f61628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Data f61629c;

        b(String str, a<Data> aVar) {
            this.f61627a = str;
            this.f61628b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f61628b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f61628b.b(this.f61629c);
            } catch (IOException unused) {
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
                Data dataC = this.f61628b.c(this.f61627a);
                this.f61629c = dataC;
                aVar.f(dataC);
            } catch (IllegalArgumentException e15) {
                aVar.c(e15);
            }
        }
    }

    public static final class c<Model> implements p<Model, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a<InputStream> f61630a = new a();

        class a implements a<InputStream> {
            a() {
            }

            @Override // fe.e.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // fe.e.a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // fe.e.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // fe.p
        public o<Model, InputStream> d(s sVar) {
            return new e(this.f61630a);
        }
    }

    public e(a<Data> aVar) {
        this.f61626a = aVar;
    }

    @Override // fe.o
    public o.a<Data> a(Model model, int i15, int i16, zd.h hVar) {
        return new o.a<>(new ue.d(model), new b(model.toString(), this.f61626a));
    }

    @Override // fe.o
    public boolean b(Model model) {
        return model.toString().startsWith("data:image");
    }
}
