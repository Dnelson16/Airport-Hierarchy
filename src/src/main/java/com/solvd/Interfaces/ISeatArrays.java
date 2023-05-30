package com.solvd.Interfaces;

import com.solvd.services.Ticket;

public interface ISeatArrays<T extends Ticket> {
    T[] seatArrays(T[] A, T[] B);
}
