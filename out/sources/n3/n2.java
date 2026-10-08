package n3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Ln3/n2;", "", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f131040a;

    /* JADX INFO: renamed from: n3.n2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ln3/n2$a;", "", "<init>", "()V", "", "intervals", "", "phase", "Ln3/n2;", "a", "([FF)Ln3/n2;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f131040a = new Companion();

        private Companion() {
        }

        public static /* synthetic */ n2 b(Companion companion, float[] fArr, float f15, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                f15 = 0.0f;
            }
            return companion.a(fArr, f15);
        }

        public final n2 a(float[] intervals, float phase) {
            return r0.a(intervals, phase);
        }
    }
}
