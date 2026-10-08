package com.bumptech.glide.load;

import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import ie.y;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    class C0740a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f28810a;

        C0740a(InputStream inputStream) {
            this.f28810a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.f28810a);
            } finally {
                this.f28810a.reset();
            }
        }
    }

    class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f28811a;

        b(ByteBuffer byteBuffer) {
            this.f28811a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.b(this.f28811a);
            } finally {
                ve.a.d(this.f28811a);
            }
        }
    }

    class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f28812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ce.b f28813b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ce.b bVar) {
            this.f28812a = parcelFileDescriptorRewinder;
            this.f28813b = bVar;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            y yVar = null;
            try {
                FileDescriptor fileDescriptor = this.f28812a.a().getFileDescriptor();
                y yVar2 = new y(io.sentry.instrumentation.file.h.b.b(new FileInputStream(fileDescriptor), fileDescriptor), this.f28813b);
                try {
                    ImageHeaderParser.ImageType imageTypeC = imageHeaderParser.c(yVar2);
                    yVar2.m();
                    this.f28812a.a();
                    return imageTypeC;
                } catch (Throwable th4) {
                    th = th4;
                    yVar = yVar2;
                    if (yVar != null) {
                        yVar.m();
                    }
                    this.f28812a.a();
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f28814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ce.b f28815b;

        d(ByteBuffer byteBuffer, ce.b bVar) {
            this.f28814a = byteBuffer;
            this.f28815b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.a(this.f28814a, this.f28815b);
            } finally {
                ve.a.d(this.f28814a);
            }
        }
    }

    class e implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f28816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ce.b f28817b;

        e(InputStream inputStream, ce.b bVar) {
            this.f28816a = inputStream;
            this.f28817b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f28816a, this.f28817b);
            } finally {
                this.f28816a.reset();
            }
        }
    }

    class f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f28818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ce.b f28819b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ce.b bVar) {
            this.f28818a = parcelFileDescriptorRewinder;
            this.f28819b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            y yVar = null;
            try {
                FileDescriptor fileDescriptor = this.f28818a.a().getFileDescriptor();
                y yVar2 = new y(io.sentry.instrumentation.file.h.b.b(new FileInputStream(fileDescriptor), fileDescriptor), this.f28819b);
                try {
                    int iD = imageHeaderParser.d(yVar2, this.f28819b);
                    yVar2.m();
                    this.f28818a.a();
                    return iD;
                } catch (Throwable th4) {
                    th = th4;
                    yVar = yVar2;
                    if (yVar != null) {
                        yVar.m();
                    }
                    this.f28818a.a();
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    private interface g {
        int a(ImageHeaderParser imageHeaderParser);
    }

    private interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ce.b bVar) {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List<ImageHeaderParser> list, InputStream inputStream, ce.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(List<ImageHeaderParser> list, ByteBuffer byteBuffer, ce.b bVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    private static int d(List<ImageHeaderParser> list, g gVar) {
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            int iA = gVar.a(list.get(i15));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ce.b bVar) {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType f(List<ImageHeaderParser> list, InputStream inputStream, ce.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new C0740a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType h(List<ImageHeaderParser> list, h hVar) {
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            ImageHeaderParser.ImageType imageTypeA = hVar.a(list.get(i15));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
