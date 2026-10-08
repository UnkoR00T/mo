package p143z0;

import oq.a;
import p071kotlin.Metadata;
import u0.l;
import u0.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b8WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lz0/y;", "", "", "offset", "size", "containerSize", "a", "(FFF)F", "Lu0/l;", "b", "()Lu0/l;", "getScrollAnimationSpec$annotations", "()V", "scrollAnimationSpec", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f231776a;

    /* JADX INFO: renamed from: z0.y$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lz0/y$a;", "", "<init>", "()V", "", "offset", "size", "containerSize", "a", "(FFF)F", "Lu0/l;", "b", "Lu0/l;", "c", "()Lu0/l;", "DefaultScrollAnimationSpec", "Lz0/y;", "Lz0/y;", "()Lz0/y;", "DefaultBringIntoViewSpec", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f231776a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final l<Float> DefaultScrollAnimationSpec = m.j(0.0f, 0.0f, null, 7, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final y DefaultBringIntoViewSpec = new C6224a();

        /* JADX INFO: renamed from: z0.y$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"z0/y$a$a", "Lz0/y;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C6224a implements y {
            C6224a() {
            }
        }

        private Companion() {
        }

        public final float a(float offset, float size, float containerSize) {
            float f15 = size + offset;
            if (offset >= 0.0f && f15 <= containerSize) {
                return 0.0f;
            }
            if (offset < 0.0f && f15 > containerSize) {
                return 0.0f;
            }
            float f16 = f15 - containerSize;
            return Math.abs(offset) < Math.abs(f16) ? offset : f16;
        }

        public final y b() {
            return DefaultBringIntoViewSpec;
        }

        public final l<Float> c() {
            return DefaultScrollAnimationSpec;
        }
    }

    default float a(float offset, float size, float containerSize) {
        return INSTANCE.a(offset, size, containerSize);
    }

    @a
    default l<Float> b() {
        return INSTANCE.c();
    }
}
