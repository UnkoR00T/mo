package ja;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lja/o;", "previous", "Lja/y;", "loadType", "", "a", "(Lja/o;Lja/o;Lja/y;)Z", "paging-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i0 {
    public static final boolean a(GenerationalViewportHint generationalViewportHint, GenerationalViewportHint generationalViewportHint2, y yVar) {
        if (generationalViewportHint.getGenerationId() > generationalViewportHint2.getGenerationId()) {
            return true;
        }
        if (generationalViewportHint.getGenerationId() < generationalViewportHint2.getGenerationId()) {
            return false;
        }
        return s.a(generationalViewportHint.getHint(), generationalViewportHint2.getHint(), yVar);
    }
}
