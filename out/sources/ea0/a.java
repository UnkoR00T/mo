package ea0;

import b54.c;
import c54.b;
import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lea0/a;", "Lba0/a;", "Lc54/b;", "isFeatureEnabledUseCase", "<init>", "(Lc54/b;)V", "Lba0/a$a;", "params", "", "Laa0/b;", "d", "(Lba0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lc54/b;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ba0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b isFeatureEnabledUseCase;

    public a(b bVar) {
        this.isFeatureEnabledUseCase = bVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(ba0.a.Params params, e<? super List<? extends aa0.b>> eVar) {
        aa0.b bVar = aa0.b.DRIVING_LICENCE;
        if (!this.isFeatureEnabledUseCase.a(c.MJUNIOR_TEMPORARY_DRIVING_LICENCE).booleanValue()) {
            bVar = null;
        }
        aa0.b bVar2 = aa0.b.FAMILY_CARD;
        if (!this.isFeatureEnabledUseCase.a(c.MJUNIOR_FAMILY_CARD).booleanValue()) {
            bVar2 = null;
        }
        aa0.b bVar3 = aa0.b.UUT_CARD;
        if (!this.isFeatureEnabledUseCase.a(c.MJUNIOR_UUT_CARD).booleanValue()) {
            bVar3 = null;
        }
        List listS = v.s(bVar, bVar2, bVar3, this.isFeatureEnabledUseCase.a(c.MJUNIOR_LON_CARD).booleanValue() ? aa0.b.DISABLED_PERSON_IDENTIFICATION_CARD : null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS) {
            if (!params.a().contains((aa0.b) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
