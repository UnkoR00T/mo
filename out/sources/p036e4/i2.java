package p036e4;

import er.p;
import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B%\b\u0004\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH ¢\u0006\u0004\b\f\u0010\rR.\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Le4/i2;", "", "Lkotlin/Function2;", "Le4/a2$a;", "", "calculate", "<init>", "(Ler/p;)V", "coordinate", "Le4/b0;", "sourceCoordinates", "targetCoordinates", "a", "(FLe4/b0;Le4/b0;)F", "Ler/p;", "b", "()Ler/p;", "Le4/r;", "Le4/x2;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p<a2.a, Float, Float> calculate;

    public /* synthetic */ i2(p pVar, k kVar) {
        this(pVar);
    }

    public abstract float a(float coordinate, b0 sourceCoordinates, b0 targetCoordinates);

    public final p<a2.a, Float, Float> b() {
        return this.calculate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private i2(p<? super a2.a, ? super Float, Float> pVar) {
        this.calculate = pVar;
    }
}
