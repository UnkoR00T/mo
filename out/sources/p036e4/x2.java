package p036e4;

import er.p;
import fr.k;
import fr.w;
import m3.e;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\rB%\b\u0002\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Le4/x2;", "Le4/i2;", "Lkotlin/Function2;", "Le4/a2$a;", "", "calculation", "<init>", "(Ler/p;)V", "()V", "coordinate", "Le4/b0;", "sourceCoordinates", "targetCoordinates", "a", "(FLe4/b0;Le4/b0;)F", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x2 extends i2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e4.x2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\t\u0010\bJ'\u0010\u000e\u001a\u00020\u00052\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Le4/x2$a;", "", "<init>", "()V", "", "Le4/x2;", "rulers", "b", "([Le4/x2;)Le4/x2;", "c", "Lkotlin/Function2;", "Le4/a2$a;", "", "calculation", "a", "(Ler/p;)Le4/x2;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: e4.x2$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le4/a2$a;", "", "defaultValue", "c", "(Le4/a2$a;F)Ljava/lang/Float;"}, k = 3, mv = {2, 1, 0})
        static final class C1088a extends w implements p<a2.a, Float, Float> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x2[] f47471b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1088a(x2[] x2VarArr) {
                super(2);
                this.f47471b = x2VarArr;
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Float B(a2.a aVar, Float f15) {
                return c(aVar, f15.floatValue());
            }

            public final Float c(a2.a aVar, float f15) {
                return Float.valueOf(j2.b(aVar, true, this.f47471b, f15));
            }
        }

        /* JADX INFO: renamed from: e4.x2$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le4/a2$a;", "", "defaultValue", "c", "(Le4/a2$a;F)Ljava/lang/Float;"}, k = 3, mv = {2, 1, 0})
        static final class b extends w implements p<a2.a, Float, Float> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x2[] f47472b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(x2[] x2VarArr) {
                super(2);
                this.f47472b = x2VarArr;
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Float B(a2.a aVar, Float f15) {
                return c(aVar, f15.floatValue());
            }

            public final Float c(a2.a aVar, float f15) {
                return Float.valueOf(j2.b(aVar, false, this.f47472b, f15));
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final x2 a(p<? super a2.a, ? super Float, Float> calculation) {
            return new x2(calculation, null);
        }

        public final x2 b(x2... rulers) {
            return a(new C1088a(rulers));
        }

        public final x2 c(x2... rulers) {
            return a(new b(rulers));
        }

        private Companion() {
        }
    }

    public /* synthetic */ x2(p pVar, k kVar) {
        this(pVar);
    }

    @Override // p036e4.i2
    public float a(float coordinate, b0 sourceCoordinates, b0 targetCoordinates) {
        return Float.intBitsToFloat((int) (targetCoordinates.r(sourceCoordinates, e.e((((long) Float.floatToRawIntBits(((int) (sourceCoordinates.b() & BodyPartID.bodyIdMax)) / 2.0f)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(coordinate) << 32))) >> 32));
    }

    private x2(p<? super a2.a, ? super Float, Float> pVar) {
        super(pVar, null);
    }

    public x2() {
        this(null);
    }
}
