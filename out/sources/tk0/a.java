package tk0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import uk0.HydroWarningAreaDto;
import uk0.HydroWarningDto;
import uk0.HydroWarningLineDto;
import uk0.HydroWarningMultiPolygonDto;
import uk0.HydroWarningPointDto;
import uk0.HydroWarningPolygonDto;
import xk0.BEHydroWarning;
import xk0.BEHydroWarningArea;
import xk0.BEHydroWarningLine;
import xk0.BEHydroWarningMultiPolygon;
import xk0.BEHydroWarningPoint;
import xk0.BEHydroWarningPolygon;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Luk0/b;", "Lxk0/a;", "a", "(Luk0/b;)Lxk0/a;", "Luk0/a;", "Lxk0/b;", "b", "(Luk0/a;)Lxk0/b;", "Luk0/d;", "Lxk0/d;", "d", "(Luk0/d;)Lxk0/d;", "Luk0/f;", "Lxk0/f;", "f", "(Luk0/f;)Lxk0/f;", "Luk0/c;", "Lxk0/c;", "c", "(Luk0/c;)Lxk0/c;", "Luk0/e;", "Lxk0/e;", "e", "(Luk0/e;)Lxk0/e;", "disasteralertservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final BEHydroWarning a(HydroWarningDto hydroWarningDto) {
        return new BEHydroWarning(hydroWarningDto.getArea(), hydroWarningDto.getComment(), hydroWarningDto.getDateFrom(), hydroWarningDto.getDateTo(), hydroWarningDto.getDescription(), hydroWarningDto.getEventType(), hydroWarningDto.getLevel(), hydroWarningDto.getNumber(), hydroWarningDto.getOffice(), hydroWarningDto.getProbability(), hydroWarningDto.getPublishedAt(), hydroWarningDto.l());
    }

    public static final BEHydroWarningArea b(HydroWarningAreaDto hydroWarningAreaDto) {
        ArrayList arrayList;
        Integer level = hydroWarningAreaDto.getLevel();
        List<HydroWarningMultiPolygonDto> listB = hydroWarningAreaDto.b();
        if (listB != null) {
            List<HydroWarningMultiPolygonDto> list = listB;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(d((HydroWarningMultiPolygonDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new BEHydroWarningArea(level, arrayList);
    }

    private static final BEHydroWarningLine c(HydroWarningLineDto hydroWarningLineDto) {
        List<HydroWarningPointDto> listA = hydroWarningLineDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(e((HydroWarningPointDto) it.next()));
        }
        return new BEHydroWarningLine(arrayList);
    }

    private static final BEHydroWarningMultiPolygon d(HydroWarningMultiPolygonDto hydroWarningMultiPolygonDto) {
        String code = hydroWarningMultiPolygonDto.getCode();
        List<HydroWarningPolygonDto> listB = hydroWarningMultiPolygonDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(f((HydroWarningPolygonDto) it.next()));
        }
        return new BEHydroWarningMultiPolygon(code, arrayList);
    }

    private static final BEHydroWarningPoint e(HydroWarningPointDto hydroWarningPointDto) {
        return new BEHydroWarningPoint(hydroWarningPointDto.getLat(), hydroWarningPointDto.getLon());
    }

    private static final BEHydroWarningPolygon f(HydroWarningPolygonDto hydroWarningPolygonDto) {
        List<HydroWarningLineDto> listA = hydroWarningPolygonDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(c((HydroWarningLineDto) it.next()));
        }
        return new BEHydroWarningPolygon(arrayList, c(hydroWarningPolygonDto.getOutline()));
    }
}
