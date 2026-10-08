package ru0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ou0.Ticket;
import ou0.c;
import p071kotlin.Metadata;
import pq.v;
import su0.TicketDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0002*\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "Lsu0/a;", "Lou0/b;", "a", "(Ljava/util/List;)Ljava/util/List;", "b", "(Lsu0/a;)Lou0/b;", "taxservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final List<Ticket> a(List<TicketDto> list) {
        List<TicketDto> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(b((TicketDto) it.next()));
        }
        return arrayList;
    }

    public static final Ticket b(TicketDto ticketDto) {
        return new Ticket(ticketDto.getTicketId(), ticketDto.getIssuer(), ticketDto.getNumberAndSeries(), ticketDto.getIssueDate(), c.INSTANCE.a(ticketDto.getTicketType().getValue()), ticketDto.getAmount(), ticketDto.getAmountToPay(), ticketDto.getInExecution(), ticketDto.getCanBePaid());
    }
}
