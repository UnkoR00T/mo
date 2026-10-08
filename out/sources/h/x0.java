package h;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lh/x0;", "", "Lh/y0;", "c", "()I", "id", "", "a", "maxImages", "Lh/o1;", "b", "format", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface x0 {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lh/x0$a;", "", "Lh/c0$a;", "stream", "", "maxImages", "Lh/o1;", "streamFormat", "<init>", "(Lh/c0$a;IILfr/k;)V", "a", "Lh/c0$a;", "b", "()Lh/c0$a;", "I", "()I", "c", "setStreamFormat-hNQ4ISI", "(I)V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c0.a stream;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int maxImages;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int streamFormat;

        public /* synthetic */ a(c0.a aVar, int i15, int i16, fr.k kVar) {
            this(aVar, i15, i16);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getMaxImages() {
            return this.maxImages;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c0.a getStream() {
            return this.stream;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getStreamFormat() {
            return this.streamFormat;
        }

        private a(c0.a aVar, int i15, int i16) {
            this.stream = aVar;
            this.maxImages = i15;
            this.streamFormat = i16;
        }
    }

    int a();

    int b();

    int c();
}
