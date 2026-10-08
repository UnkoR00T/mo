package p114t0;

import androidx.compose.ui.graphics.Color;
import fr.w;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\"'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008@X\u0080\u0084\u0002¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005\"'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00008@X\u0080\u0084\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0003\u0012\u0004\b\n\u0010\u0007\u001a\u0004\b\u0002\u0010\u0005¨\u0006\f"}, d2 = {"Lm2/b4;", "Lt0/m0;", "a", "Loq/k;", "b", "()Lm2/b4;", "getLocalLookaheadAnimationVisualDebugConfig$annotations", "()V", "LocalLookaheadAnimationVisualDebugConfig", "Landroidx/compose/ui/graphics/Color;", "getLocalLookaheadAnimationVisualDebugColor$annotations", "LocalLookaheadAnimationVisualDebugColor", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k f186465a = l.a(b.f186469b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k f186466b = l.a(a.f186467b);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm2/b4;", "Landroidx/compose/ui/graphics/Color;", "c", "()Lm2/b4;"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements er.a<b4<Color>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f186467b = new a();

        /* JADX INFO: renamed from: t0.u$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "c", "()J"}, k = 3, mv = {2, 1, 0})
        static final class C4825a extends w implements er.a<Color> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C4825a f186468b = new C4825a();

            C4825a() {
                super(0);
            }

            @Override // er.a
            public /* bridge */ /* synthetic */ Color a() {
                return Color.m0boximpl(c());
            }

            public final long c() {
                return Color.INSTANCE.h();
            }
        }

        a() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final b4<Color> a() {
            return d0.j(C4825a.f186468b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm2/b4;", "Lt0/m0;", "c", "()Lm2/b4;"}, k = 3, mv = {2, 1, 0})
    static final class b extends w implements er.a<b4<LookaheadAnimationVisualDebugConfig>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f186469b = new b();

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt0/m0;", "c", "()Lt0/m0;"}, k = 3, mv = {2, 1, 0})
        static final class a extends w implements er.a<LookaheadAnimationVisualDebugConfig> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f186470b = new a();

            a() {
                super(0);
            }

            @Override // er.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final LookaheadAnimationVisualDebugConfig a() {
                return new LookaheadAnimationVisualDebugConfig(false, 0L, 0L, 0L, false, 30, null);
            }
        }

        b() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final b4<LookaheadAnimationVisualDebugConfig> a() {
            return d0.j(a.f186470b);
        }
    }

    public static final b4<Color> a() {
        return (b4) f186466b.getValue();
    }

    public static final b4<LookaheadAnimationVisualDebugConfig> b() {
        return (b4) f186465a.getValue();
    }
}
