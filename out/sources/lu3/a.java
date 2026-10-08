package lu3;

import iy.b0;
import iy.c0;
import ju3.ChildData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lal0/u;", "Lju3/a;", "a", "(Lal0/u;)Lju3/a;", "choosechild_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final ChildData a(al0.ChildData childData) {
        String childId = childData.getChildId();
        b0 b0VarG = c0.g(childData.getFirstName());
        b0 pesel = childData.getPesel();
        b0 b0VarG2 = c0.g(childData.getSurname());
        String secondName = childData.getSecondName();
        return new ChildData(childId, b0VarG, pesel, b0VarG2, secondName != null ? c0.g(secondName) : null, null);
    }
}
