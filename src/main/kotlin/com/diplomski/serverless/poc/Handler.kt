package com.diplomski.serverless.poc

import com.diplomski.serverless.ApplicationOsobneFinancije
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler

class Handler : SpringBootRequestHandler<NumberInput, NumberOutput>(ApplicationOsobneFinancije::class.java)