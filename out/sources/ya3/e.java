package ya3;

import ab3.Transformation;
import android.graphics.Bitmap;
import fx.Rectangle;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lya3/e;", "", "a", "b", "c", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f225812a;

    /* JADX INFO: renamed from: ya3.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lya3/e$a;", "", "<init>", "()V", "Lm3/e;", "b", "J", "a", "()J", "INITIAL_OFFSET", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f225812a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final long INITIAL_OFFSET = m3.e.INSTANCE.c();

        private Companion() {
        }

        public final long a() {
            return INITIAL_OFFSET;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u000b\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lya3/e$b;", "", "Landroid/graphics/Bitmap;", "m0", "()Landroid/graphics/Bitmap;", "image", "", "a", "()F", "scale", "Lm3/e;", "b", "()J", "offset", "Lya3/e$b$a;", "Lya3/e$b$b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: ya3.e$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b(\u0010'R\u001b\u0010,\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010#¨\u0006-"}, d2 = {"Lya3/e$b$a;", "Lya3/e$b;", "Landroid/graphics/Bitmap;", "image", "", "scale", "Lm3/e;", "offset", "Lfx/e;", "imageContainer", "container", "<init>", "(Landroid/graphics/Bitmap;FJLfx/e;Lfx/e;Lfr/k;)V", "e", "(Landroid/graphics/Bitmap;FJLfx/e;Lfx/e;)Lya3/e$b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "m0", "()Landroid/graphics/Bitmap;", "b", "F", "()F", "c", "J", "()J", "d", "Lfx/e;", "i", "()Lfx/e;", "g", "f", "Loq/k;", "h", "containerCenter", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Bitmap image;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final float scale;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final long offset;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Rectangle imageContainer;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Rectangle container;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            private final oq.k containerCenter;

            public /* synthetic */ Initialized(Bitmap bitmap, float f15, long j15, Rectangle rectangle, Rectangle rectangle2, fr.k kVar) {
                this(bitmap, f15, j15, rectangle, rectangle2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final m3.e d(Initialized initialized) {
                float width = initialized.container.getWidth() / 2.0f;
                float height = initialized.container.getHeight() / 2.0f;
                return m3.e.d(m3.e.e((((long) Float.floatToRawIntBits(width)) << 32) | (((long) Float.floatToRawIntBits(height)) & BodyPartID.bodyIdMax)));
            }

            public static /* synthetic */ Initialized f(Initialized initialized, Bitmap bitmap, float f15, long j15, Rectangle rectangle, Rectangle rectangle2, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bitmap = initialized.image;
                }
                if ((i15 & 2) != 0) {
                    f15 = initialized.scale;
                }
                if ((i15 & 4) != 0) {
                    j15 = initialized.offset;
                }
                if ((i15 & 8) != 0) {
                    rectangle = initialized.imageContainer;
                }
                if ((i15 & 16) != 0) {
                    rectangle2 = initialized.container;
                }
                long j16 = j15;
                return initialized.e(bitmap, f15, j16, rectangle, rectangle2);
            }

            @Override // ya3.e.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public float getScale() {
                return this.scale;
            }

            @Override // ya3.e.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public long getOffset() {
                return this.offset;
            }

            public final Initialized e(Bitmap image, float scale, long offset, Rectangle imageContainer, Rectangle container) {
                return new Initialized(image, scale, offset, imageContainer, container, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.image, initialized.image) && Float.compare(this.scale, initialized.scale) == 0 && m3.e.j(this.offset, initialized.offset) && fr.t.c(this.imageContainer, initialized.imageContainer) && fr.t.c(this.container, initialized.container);
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Rectangle getContainer() {
                return this.container;
            }

            public final long h() {
                return ((m3.e) this.containerCenter.getValue()).getPackedValue();
            }

            public int hashCode() {
                return (((((((this.image.hashCode() * 31) + Float.hashCode(this.scale)) * 31) + m3.e.o(this.offset)) * 31) + this.imageContainer.hashCode()) * 31) + this.container.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final Rectangle getImageContainer() {
                return this.imageContainer;
            }

            @Override // ya3.e.b
            /* JADX INFO: renamed from: m0, reason: from getter */
            public Bitmap getImage() {
                return this.image;
            }

            public String toString() {
                return "Initialized(image=" + this.image + ", scale=" + this.scale + ", offset=" + ((Object) m3.e.s(this.offset)) + ", imageContainer=" + this.imageContainer + ", container=" + this.container + ')';
            }

            private Initialized(Bitmap bitmap, float f15, long j15, Rectangle rectangle, Rectangle rectangle2) {
                this.image = bitmap;
                this.scale = f15;
                this.offset = j15;
                this.imageContainer = rectangle;
                this.container = rectangle2;
                this.containerCenter = oq.l.a(new er.a() { // from class: ya3.g
                    @Override // er.a
                    public final Object a() {
                        return e.b.Initialized.d(this.f225832a);
                    }
                });
            }

            public /* synthetic */ Initialized(Bitmap bitmap, float f15, long j15, Rectangle rectangle, Rectangle rectangle2, int i15, fr.k kVar) {
                this(bitmap, (i15 & 2) != 0 ? 1.0f : f15, (i15 & 4) != 0 ? e.INSTANCE.a() : j15, rectangle, rectangle2, null);
            }
        }

        /* JADX INFO: renamed from: ya3.e$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001f"}, d2 = {"Lya3/e$b$b;", "Lya3/e$b;", "Landroid/graphics/Bitmap;", "image", "<init>", "(Landroid/graphics/Bitmap;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "m0", "()Landroid/graphics/Bitmap;", "", "b", "F", "()F", "scale", "Lm3/e;", "c", "J", "()J", "offset", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Measuring implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Bitmap image;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final float scale = 1.0f;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final long offset = e.INSTANCE.a();

            public Measuring(Bitmap bitmap) {
                this.image = bitmap;
            }

            @Override // ya3.e.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public float getScale() {
                return this.scale;
            }

            @Override // ya3.e.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public long getOffset() {
                return this.offset;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Measuring) && fr.t.c(this.image, ((Measuring) other).image);
            }

            public int hashCode() {
                return this.image.hashCode();
            }

            @Override // ya3.e.b
            /* JADX INFO: renamed from: m0, reason: from getter */
            public Bitmap getImage() {
                return this.image;
            }

            public String toString() {
                return "Measuring(image=" + this.image + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        float getScale();

        /* JADX INFO: renamed from: b */
        long getOffset();

        /* JADX INFO: renamed from: m0 */
        Bitmap getImage();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lya3/e$c;", "Ll00/e;", "Lya3/e$c$a;", "a", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c extends l00.e<Data> {

        /* JADX INFO: renamed from: ya3.e$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lya3/e$c$a;", "", "Li50/a;", "scaffoldData", "Lkotlin/Function1;", "Lfx/e;", "Loq/i0;", "onContainerChanged", "Lya3/e$c$a$a;", "image", "<init>", "(Li50/a;Ler/l;Lya3/e$c$a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Ler/l;", "()Ler/l;", "Lya3/e$c$a$a;", "()Lya3/e$c$a$a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Data {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<Rectangle, i0> onContainerChanged;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ImageData image;

            /* JADX INFO: renamed from: ya3.e$c$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b$\u0010(¨\u0006)"}, d2 = {"Lya3/e$c$a$a;", "", "Landroid/graphics/Bitmap;", "bitmap", "Lmx/a;", "contentDescription", "", "scale", "Lm3/e;", "offset", "Lkotlin/Function1;", "Lab3/b;", "Loq/i0;", "onTransform", "<init>", "(Landroid/graphics/Bitmap;Lmx/a;FJLer/l;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "Lmx/a;", "()Lmx/a;", "c", "F", "e", "()F", "d", "J", "()J", "Ler/l;", "()Ler/l;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ImageData {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Bitmap bitmap;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label contentDescription;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final float scale;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final long offset;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.l<Transformation, i0> onTransform;

                public /* synthetic */ ImageData(Bitmap bitmap, Label label, float f15, long j15, er.l lVar, fr.k kVar) {
                    this(bitmap, label, f15, j15, lVar);
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final Bitmap getBitmap() {
                    return this.bitmap;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final Label getContentDescription() {
                    return this.contentDescription;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final long getOffset() {
                    return this.offset;
                }

                public final er.l<Transformation, i0> d() {
                    return this.onTransform;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final float getScale() {
                    return this.scale;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ImageData)) {
                        return false;
                    }
                    ImageData imageData = (ImageData) other;
                    return fr.t.c(this.bitmap, imageData.bitmap) && fr.t.c(this.contentDescription, imageData.contentDescription) && Float.compare(this.scale, imageData.scale) == 0 && m3.e.j(this.offset, imageData.offset) && fr.t.c(this.onTransform, imageData.onTransform);
                }

                public int hashCode() {
                    return (((((((this.bitmap.hashCode() * 31) + this.contentDescription.hashCode()) * 31) + Float.hashCode(this.scale)) * 31) + m3.e.o(this.offset)) * 31) + this.onTransform.hashCode();
                }

                public String toString() {
                    return "ImageData(bitmap=" + this.bitmap + ", contentDescription=" + this.contentDescription + ", scale=" + this.scale + ", offset=" + ((Object) m3.e.s(this.offset)) + ", onTransform=" + this.onTransform + ')';
                }

                /* JADX WARN: Multi-variable type inference failed */
                private ImageData(Bitmap bitmap, Label label, float f15, long j15, er.l<? super Transformation, i0> lVar) {
                    this.bitmap = bitmap;
                    this.contentDescription = label;
                    this.scale = f15;
                    this.offset = j15;
                    this.onTransform = lVar;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Data(BaseScaffoldData baseScaffoldData, er.l<? super Rectangle, i0> lVar, ImageData imageData) {
                this.scaffoldData = baseScaffoldData;
                this.onContainerChanged = lVar;
                this.image = imageData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ImageData getImage() {
                return this.image;
            }

            public final er.l<Rectangle, i0> b() {
                return this.onContainerChanged;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Data)) {
                    return false;
                }
                Data data = (Data) other;
                return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.onContainerChanged, data.onContainerChanged) && fr.t.c(this.image, data.image);
            }

            public int hashCode() {
                return (((this.scaffoldData.hashCode() * 31) + this.onContainerChanged.hashCode()) * 31) + this.image.hashCode();
            }

            public String toString() {
                return "Data(scaffoldData=" + this.scaffoldData + ", onContainerChanged=" + this.onContainerChanged + ", image=" + this.image + ')';
            }
        }
    }
}
