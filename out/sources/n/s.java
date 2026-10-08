package n;

import android.media.Image;
import fr.q0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005J\u000f\u0010\u0002\u001a\u00020\u0000H&¢\u0006\u0004\b\u0002\u0010\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Ln/s;", "Ln/r;", "z", "()Ln/s;", "f0", "a", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface s extends r {

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f129759a;

    /* JADX INFO: renamed from: n.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln/s$a;", "", "<init>", "()V", "Ln/r;", "image", "Ln/s;", "a", "(Ln/r;)Ln/s;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f129759a = new Companion();

        /* JADX INFO: renamed from: n.s$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ)\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Ln/s$a$a;", "Ln/r;", "Ln/s;", "outputImage", "Ln/t;", "sharedReference", "<init>", "(Ln/r;Ln/t;)V", "z", "()Ln/s;", "d1", "", "T", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "Loq/i0;", "close", "()V", "", "toString", "()Ljava/lang/String;", "a", "Ln/r;", "b", "Ln/t;", "Liu/a;", "c", "Liu/a;", "closed", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class C3232a implements r, s {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final r outputImage;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final t<r> sharedReference;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final iu.a closed = iu.b.a(false);

            public C3232a(r rVar, t<r> tVar) {
                this.outputImage = rVar;
                this.sharedReference = tVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // h.t1
            public <T> T c0(mr.c<T> type) {
                if (this.closed.b()) {
                    return null;
                }
                if (fr.t.c(type, q0.c(s.class)) || fr.t.c(type, q0.c(r.class)) || fr.t.c(type, q0.c(o.class))) {
                    return this;
                }
                if (!fr.t.c(type, q0.c(Image.class))) {
                    return (T) this.outputImage.c0(type);
                }
                throw new UnsupportedOperationException("Cannot unwrap " + this + " as android.media.Image. Use setFinalizerinstead and close all outstanding references.");
            }

            @Override // java.lang.AutoCloseable
            public void close() {
                if (this.closed.a(false, true)) {
                    this.sharedReference.b();
                }
            }

            public s d1() {
                if (this.closed.b() || this.sharedReference.a() == null) {
                    return null;
                }
                return new C3232a(this.outputImage, this.sharedReference);
            }

            public String toString() {
                return this.outputImage.toString();
            }

            @Override // n.s
            public s z() {
                s sVarD1 = d1();
                if (sVarD1 != null) {
                    return sVarD1;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }

        private Companion() {
        }

        public final s a(r image) {
            if (image instanceof s) {
                return ((s) image).z();
            }
            s sVar = (s) image.c0(q0.c(s.class));
            return sVar != null ? sVar.z() : new C3232a(image, new t(image, f.f129755a));
        }
    }

    s z();
}
