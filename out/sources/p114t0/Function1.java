package p114t0;

import androidx.compose.ui.graphics.Color;
import er.l;
import fr.w;
import n3.o1;
import o3.c;
import o3.k;
import p071kotlin.Metadata;
import u0.s;
import u0.s3;
import u0.y2;

/* JADX INFO: renamed from: t0.t, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\",\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"-\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0000*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Lo3/c;", "Lu0/y2;", "Landroidx/compose/ui/graphics/Color;", "Lu0/s;", "a", "Ler/l;", "ColorToVector", "Landroidx/compose/ui/graphics/Color$a;", "(Landroidx/compose/ui/graphics/Color$a;)Ler/l;", "VectorConverter", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l<c, y2<Color, s>> f186452a = a.f186453b;

    /* JADX INFO: renamed from: t0.t$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo3/c;", "colorSpace", "Lu0/y2;", "Landroidx/compose/ui/graphics/Color;", "Lu0/s;", "c", "(Lo3/c;)Lu0/y2;"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements l<c, y2<Color, s>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f186453b = new a();

        /* JADX INFO: renamed from: t0.t$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "color", "Lu0/s;", "c", "(J)Lu0/s;"}, k = 3, mv = {2, 1, 0})
        static final class C4822a extends w implements l<Color, s> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C4822a f186454b = new C4822a();

            C4822a() {
                super(1);
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ s b(Color color) {
                return c(color.m20unboximpl());
            }

            public final s c(long j15) {
                long jM7convertvNxB06k = Color.m7convertvNxB06k(j15, k.f141750a.D());
                return new s(Color.m12getAlphaimpl(jM7convertvNxB06k), Color.m16getRedimpl(jM7convertvNxB06k), Color.m15getGreenimpl(jM7convertvNxB06k), Color.m13getBlueimpl(jM7convertvNxB06k));
            }
        }

        /* JADX INFO: renamed from: t0.t$a$b */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/s;", "vector", "Landroidx/compose/ui/graphics/Color;", "c", "(Lu0/s;)J"}, k = 3, mv = {2, 1, 0})
        static final class b extends w implements l<s, Color> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f186455b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c cVar) {
                super(1);
                this.f186455b = cVar;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ Color b(s sVar) {
                return Color.m0boximpl(c(sVar));
            }

            public final long c(s sVar) {
                float v15 = sVar.getV2();
                if (v15 < 0.0f) {
                    v15 = 0.0f;
                }
                if (v15 > 1.0f) {
                    v15 = 1.0f;
                }
                float v16 = sVar.getV3();
                if (v16 < -0.5f) {
                    v16 = -0.5f;
                }
                if (v16 > 0.5f) {
                    v16 = 0.5f;
                }
                float v17 = sVar.getV4();
                float f15 = v17 >= -0.5f ? v17 : -0.5f;
                float f16 = f15 <= 0.5f ? f15 : 0.5f;
                float v18 = sVar.getV1();
                float f17 = v18 >= 0.0f ? v18 : 0.0f;
                return Color.m7convertvNxB06k(o1.a(v15, v16, f16, f17 <= 1.0f ? f17 : 1.0f, k.f141750a.D()), this.f186455b);
            }
        }

        a() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final y2<Color, s> b(c cVar) {
            return s3.K(C4822a.f186454b, new b(cVar));
        }
    }

    public static final l<c, y2<Color, s>> a(Color.Companion companion) {
        return f186452a;
    }
}
