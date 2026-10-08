package xx;

import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import tq.e;
import vy.Coordinates;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@¢\u0006\u0004\b\b\u0010\tJ.\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007H¦@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0019\u0010\u0011¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lxx/a;", "", "", "uri", "", "Lxx/b;", "tagsGroups", "", "e", "(Ljava/lang/String;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "", "image", "attributes", "c", "([BLjava/util/Map;Ltq/e;)Ljava/lang/Object;", "Lvy/c;", "d", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "imageBase64", "gpsCoordinates", "a", "(Ljava/lang/String;Lvy/c;Ltq/e;)Ljava/lang/Object;", "f", "([BLtq/e;)Ljava/lang/Object;", "", "b", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(String str, Coordinates coordinates, e<? super String> eVar);

    Object b(String str, e<? super Integer> eVar);

    Object c(byte[] bArr, Map<String, String> map, e<? super byte[]> eVar);

    Object d(String str, e<? super Coordinates> eVar);

    Object e(String str, List<? extends b> list, e<? super Map<String, String>> eVar);

    Object f(byte[] bArr, e<? super Coordinates> eVar);
}
